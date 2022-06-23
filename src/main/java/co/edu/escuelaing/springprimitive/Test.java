package co.edu.escuelaing.springprimitive;

public class Test {
    public static void main(String[] args) {
        Game game = Game.getInstance();
        game.gameInit();
        System.out.println(game.getNumber());
        String input, output;
        while (!(input = System.console().readLine()).equals("exit")) {
            output = game.PlayerAttempt(input);
            System.out.println(output);
            if (output.startsWith("Felicitaciones"))
                break;
        }
    }
}
