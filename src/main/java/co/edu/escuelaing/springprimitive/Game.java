package co.edu.escuelaing.springprimitive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    
    private static Game _instance = new Game();
    private ArrayList<Integer> number;
    private int numAttempts;

    public static Game getInstance() {
        return _instance;
    }

    public ArrayList<Integer> getNumber() {
        return number;
    }
    
    public int getNumAttempts() {
        return numAttempts;
    }

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
