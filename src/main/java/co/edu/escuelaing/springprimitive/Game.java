package co.edu.escuelaing.springprimitive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    
    private static Game _instance = new Game();
    private ArrayList<Integer> number;
    private int numAttempts;

    /**
     * Metodo que llama la instancia del juego.
     * @return Instancia singleton del juego.
     */
    public static Game getInstance() {
        return _instance;
    }

    /**
     * Retorna el numero a adivinar como un arreglo elemento a elemento.
     * @return ArrayList del numero.
     */
    public ArrayList<Integer> getNumber() {
        return number;
    }
    
    /**
     * Retorna el numero de intentos que se han realizado
     * @return Numero de intentos realizados.
     */
    public int getNumAttempts() {
        return numAttempts;
    }

    /**
     * Metodo que inicializa el juego setteando sus parametros de inicio.
     */
    public void gameInit() {
        numAttempts = 0;
        number = new ArrayList<Integer>();
        while(number.size() < 4){
            Integer randomNum = (int) (Math.random() * 10);
            if(!number.contains(randomNum)){
                number.add(randomNum);
            }
        }
    }

    /**
     * Metodo que compara el numero ingresado y contabiliza las picas y famas.
     * @param playerInput
     * @return Picas y famas obtenidas.
     */
    public String PlayerAttempt(String playerInput) {
        String message;
        int picas = 0, famas = 0;
        numAttempts++;
        List<String> playerNumber = Arrays.asList(playerInput.split(""));
        for(int i = 0;i < 4;i++){
            if(number.get(i).equals(Integer.parseInt(playerNumber.get(i)))){
                famas++;
            }else if(number.contains(Integer.parseInt(playerNumber.get(i)))){
                picas++;
            }
        }
        if(famas == 4){
            message = "Felicitaciones! Encontraste el numero en " + numAttempts + " intentos."; 
        }else{
            message = "Picas: " + picas + " Famas: " + famas;
        }
        return message;
    }
    
}
