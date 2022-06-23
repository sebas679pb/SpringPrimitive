var maxAttempts;
var attempts;

function setAttempts() {
    attempts = 0;
    document.getElementById("start").style.display = "none";
    document.getElementById("game").style.display = "none";
    document.getElementById("retry").style.display = "none";
    document.getElementById("attempt").style.display = "none";
    document.getElementById("setAttempts").style.display = "block";
    document.getElementById("attempt").innerHTML = "";
}

function gameInit() {
    const xhttp = new XMLHttpRequest();
    maxAttempts = document.getElementsByName("numAttempts")[0].value;
    xhttp.onload = function () {
        console.log(this.responseText)
        document.getElementById("game").style.display = "block";
        document.getElementById("start").style.display = "none";
        document.getElementById("attempt").style.display = "none";
        document.getElementById("retry").style.display = "none";
        document.getElementById("setAttempts").style.display = "none";
        document.getElementById("submit").style.display = "inline";
    }
    xhttp.open("GET", "/gameInit");
    xhttp.send()
}

function playerAttempt(){
    attempts++;
    const xhttp = new XMLHttpRequest();
    const number = document.getElementsByName("number")[0].value;
    document.getElementById("attempt").style.display = "block";
    xhttp.onload = function () {
        if (this.responseText.startsWith("Felicitaciones")) {
        document.getElementById("attempt").innerHTML = this.responseText;
        document.getElementById("submit").style.display = "none";
        document.getElementById("retry").style.display = "inline";
        }else if(attempts == maxAttempts){
            document.getElementById("attempt").innerHTML = "Perdiste";
            document.getElementById("submit").style.display = "none";
            document.getElementById("retry").style.display = "inline";
        }else{
            document.getElementById("attempt").insertAdjacentHTML("afterbegin","Intento #" + attempts + ": " + number + ": " + this.responseText + "</br>");
        }
    }
    xhttp.open("GET", "/playerAttempt?number=" + number);
    xhttp.send()
}