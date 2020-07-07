package hangman;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0, playOption = 0;
        boolean exit = false;
        boolean returnMenu;
        Player activePlayer;

        Game game = new Game(); // create a new object game

        Menus.welcomeMessage(); // show the header
        do { // loop the program until the user choose the option exist
            try {
                Menus.mainMenu();
                Menus.asking("Enter your option: ");
                try {
                    option = Integer.parseInt(in.next());
                } catch (NumberFormatException  error) {
            // catch the error if the user introduces a letter and casting to integer fails
                    Menus.warning("Please enter a correct a option");
                }
                switch (option) {
                    case 1: // play option
                        do { // stay in the play menu while the user specifies to exit to main menu
                            returnMenu = false;
                            Menus.playMenu();
                            try {
                                Menus.asking("Enter your option: ");
                                playOption = Integer.parseInt(in.next());
                            } catch (NumberFormatException  error) {
            // catch the error if the user introduces a letter and casting to integer fails
                                Menus.warning("Please enter a correct a option");
                            }
                            switch (playOption) {
                                case 1: // create a new user and play
                                    activePlayer = game.addPlayer();
                                    game.startPlaying(activePlayer);
                                    break;
                                case 2:
                                    //Menus.notAvailable();
                                    activePlayer = null;
                                    Menus.asking("Type your nickname: ");
                                    activePlayer = game.findPlayer((String) in.next());
                                    if (activePlayer != null) {
                                        game.startPlaying(activePlayer);
                                    }
                                    break;
                                case 3:
                                    returnMenu = true;
                                    break;
                                default:
                                    Menus.warning("Please enter an avaliable option");
                            }
                        } while(!returnMenu);
                        break;
                    case 2: //
                        //Menus.notAvailable();
                        game.showRanking();
                        break;
                    case 3:
                        //Menus.notAvailable();
                        game.showHistoric();
                        break;
                    case 4:
                        Menus.byeMessage();
                        exit = true;
                        break;
                    default:
                        Menus.warning("Please enter an avaliable option");
                        break;
                }
            }catch (Exception error) {
                Menus.warning("Generic error");
            }
        } while (!exit);
    }
}
