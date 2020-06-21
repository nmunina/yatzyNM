import java.util.Arrays;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);


    public void start() {
        greet();

        for (int i = 0; i < 1; i++) {
            makeTurn();
            saveScore();
            printScore();
        }
    }

    private void printScore() {
    }

    private void saveScore() {

    }

    private void makeTurn() {
        int[] diceState = new int[5];
        int[] rerollStates = new int[]{0, 1, 2, 3, 4};
        int i = 0;
        char response;
        do {
            //throw dice
            throwDice(diceState, rerollStates);
            System.out.println(Arrays.toString(diceState));

            System.out.print("Do you want to throw again? y or n: ");
            response = scanner.next().charAt(0);
            i++;
        } while (i < 2 && response == 'y');
        System.out.println(Arrays.toString(diceState));
    }

    private void throwDice(int[] diceState, int[] rerollStates) {
        for (int i = 0; i < rerollStates.length; i++) {
            diceState[i] = (int)(Math.random() * 6) + 1;
        }
    }

    private void greet() {
        System.out.println("Welcome to Yatzy game.");
    }
}
