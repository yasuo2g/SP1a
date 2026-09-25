import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner userinput = new Scanner(System.in);
    boolean playingTheGame1 = true;
    void main(String[] args) {
        while (playingTheGame1) {
            System.out.println("This is the start menu, press 1 to start. by clicking 0 u exit the game and delete save file.");
            int choice = userinput.nextInt();
            switch (choice) {
                case 1:
                    GameMethods.gameStarted();
                    break;
                case 0:
                    playingTheGame1 = false;
                    break;
                default:
                    System.out.println("invalid input");
            }
        }
    }
}
