import java.util.Arrays;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);

    public void start() {
        // welcome player, give instructions

        greet();

        //play the turns
        for (int i = 0; i < 1; i++) {
            // make the turn and save the score of the turn
            saveScore(makeTurn(), selectCombinationToSave());

            printScore();
        }
    }

    private void printScore() {
    }

    private void saveScore(int[] diceState, int combinationToSave) {
        printBoard();

        switch (combinationToSave) {

            case 1:
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

            case 6:
                break;

            case 7:
                break;

            case 8:
                break;

            case 9:
                break;

            case 10:
                break;

            case 11:
                break;

            case 12:
                break;

            case 13:
                break;

            case 14:
                break;

            case 15:
                break;

            case 16:
                break;
        }
    }

    private int selectCombinationToSave() {
        int combinationToSave;
        System.out.print("Write the number of combination you want to save: ");
        combinationToSave = scanner.nextInt();
        return combinationToSave;
    }

    private void printBoard() {
        System.out.println("Select the combination");

        System.out.println("1. Aces: " + "");
        System.out.println("2. Twos: " + "");
        System.out.println("3. Threes: " + "");
        System.out.println("4. Fours: " + "");
        System.out.println("5. Fives: " + "");
        System.out.println("6. Sixes: " + "");
        System.out.println("Sum 1-6: " + ""); //combined score of upper section
        System.out.println("Bonus: " + ""); //if combined score is 63 or more, add 50 points in bonus
        System.out.println("7. Two Of A Kind: " + "");
        System.out.println("8. Two Pairs: " + "");
        System.out.println("9. Three Of A Kind: " + "");
        System.out.println("10. Four Of A Kind: " + "");
        System.out.println("11. Small Straight: " + ""); // Four sequential dice (1-2-3-4, 2-3-4-5, or 3-4-5-6)
        System.out.println("12. Big Straight: " + ""); // Five sequential dice (1-2-3-4-5 or 2-3-4-5-6)
        System.out.println("13. Full House: " + "");
        System.out.println("14. Chans: " + "");
        System.out.println("15. YATZY!: " + "");


    }

    private int[] makeTurn() {
        int[] diceState = new int[5];
        int[] rerollStates = new int[]{0, 1, 2, 3, 4};
        int i = 0;
        char response;
        do {
            //throw dice
            throwDice(diceState, rerollStates);

            //show dice state
            System.out.println(Arrays.toString(diceState));

            System.out.print("Do you want to throw again? y or n: ");
            response = scanner.next().charAt(0);
            i++;
        } while (i < 2 && response == 'y');
        System.out.println(Arrays.toString(diceState));

        return diceState;
    }

    //generate 5 randome dice from 1 to 6
    private void throwDice(int[] diceState, int[] rerollStates) {
        for (int i = 0; i < rerollStates.length; i++) {
            diceState[i] = (int)(Math.random() * 6) + 1;
        }
    }

    private void greet() {
        System.out.println("Welcome to Yatzy game.");
    }
}
