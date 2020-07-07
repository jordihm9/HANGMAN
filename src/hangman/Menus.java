package hangman;

public class Menus {
    /**
     * Method to print a header when the program opens
     */
    public static void welcomeMessage() {
        System.out.print(
                "  _________   \n"+
                "  |/      |   \n"+
                "  |      (_)  \n"+
                "  |      \\|/   " + ConsoleColors.RED_BOLD + "HANGMAN GAME\n"+ ConsoleColors.RESET +
                "  |       |   \n"+
                "  |      / \\ \n"+
                "  |           \n"+
                "--+----       \n"
        );
    }

    /**
     * Method to print when the program ends
     */
    public static void byeMessage() {
        System.out.print(
                "  _________   \n"+
                "  |/      |   \n"+
                "  |      (_)  \n"+
                "  |      \\|/   " + ConsoleColors.RED_BOLD + "SEE YOU SOON\n"+ ConsoleColors.RESET +
                "  |       |   \n"+
                "  |      / \\ \n"+
                "  |           \n"+
                "--+----       \n"
        );
    }

    /**
     * Initial menu
     */
    public static void mainMenu() {
        System.out.print(
                "+------------------------+\n" +
                "|           MENU         |\n" +
                "+------------------------+\n" +
                "|    1. Play             |\n" +
                "|    2. Players Ranking  |\n" +
                "|    3. Rounds historic  |\n" +
                "|    4. Exit             |\n" +
                "+------------------------+\n"
        );
    }

    /**
     * Submenu of the first option of the initial menu (1. Play)
     */
    public static void playMenu() {
        System.out.print(
                "+ ---------------------+\n" +
                "|       PLAY MENU      |\n" +
                "+----------------------+\n" +
                "|  1. New player       |\n" +
                "|  2. Existing player  |\n" +
                "|  3. Return to menu   |\n" +
                "+----------------------+\n"
        );
    }

    /**
     * Method to print when option is not available or not working
     */
    public static void notAvailable() {
        System.out.print(ConsoleColors.YELLOW_BOLD +
                "     _______\n" +
                "    |.-----.|\n" +
                "    ||x . x||\n" +
                "    ||_.-._||\n" +
                "    `--)-(--`\n" +
                "   __[=== o]___\n" +
                "  |:::::::::::|\\\n" +
                "  `-=========-`()\n" + ConsoleColors.RESET
        );
    }

    /**
     * Show's a message in red color font
     * @param text message to print
     */
    public static void warning(String text) {
        System.out.println(ConsoleColors.RED_BOLD + "!! -- " + text + " -- !!" + ConsoleColors.RESET);
    }

    /**
     * Show's a message in green color font
     * @param text message to print
     */
    public static void informing(String text) {
        System.out.println(ConsoleColors.GREEN_BOLD + text + ConsoleColors.RESET);
    }

    /**
     * Show's a message in blue color font
     * @param text message to print
     */
    public static void asking(String text) {
        System.out.print(ConsoleColors.BLUE_BOLD + text + ConsoleColors.RESET);
    }

    /**
     * Show's a message in yellow color font
     * @param text message to print
     */
    public static void advice(String text) {
        System.out.print(ConsoleColors.YELLOW_BOLD + text + ConsoleColors.RESET);
    }

    /**
     * Method to print the underscores and letters from the word to be guessed
     * If it's a underscore character, prints in purple color font,
     * if not, prints the character in green color font
     * @param guessWord array with the letters of the word to be guessed
     */
    public static void printGuessLine(char[] guessWord) {
        for (int i = 0; i < guessWord.length; i++) {
            if (guessWord[i] == '_') {
                System.out.print(ConsoleColors.PURPLE_BOLD + guessWord[i] + ConsoleColors.RESET);
            } else {
                System.out.print(ConsoleColors.GREEN_BOLD + guessWord[i] + ConsoleColors.RESET);
            }
        }
    }


}
