package hangman;
/*
     _________
     |/      |
     |      (_)
     |      \|/
     |       |
     |      / \
     |
    _|___
 */
public class HangmanState {
    public static void stage1() {
        System.out.print(
                "--+----" + "\n"
        );
    }
    public static void stage2() {
        System.out.print(
                "  |\n"+
                "  |\n"+
                "  |\n"+
                "  |\n"+
                "  |\n"+
                "  |\n"+
                "--+----" + "\n"
        );
    }
    public static void stage3() {
        System.out.print(
                "  _________\n"+
                "  |/       \n"+
                "  |        \n"+
                "  |        \n"+
                "  |        \n"+
                "  |        \n"+
                "  |        \n"+
                "--+----" + "\n"
        );
    }
    public static void stage4() {
        System.out.print(
                "  _________\n"+
                "  |/      | \n"+
                "  |      (_) \n"+
                "  |        \n"+
                "  |        \n"+
                "  |        \n"+
                "  |        \n"+
                "--+----" + "\n"
        );
    }
    public static void stage5() {
        System.out.print(
                "  _________\n"+
                "  |/      | \n"+
                "  |      (_) \n"+
                "  |       |\n"+
                "  |       |\n"+
                "  |        \n"+
                "  |        \n"+
                "--+----" + "\n"
        );
    }
    public static void stage6() {
        System.out.print(
                "  _________\n"+
                "  |/      | \n"+
                "  |      (_) \n"+
                "  |       |\n"+
                "  |       |\n"+
                "  |      / \\ \n"+
                "  |        \n"+
                "--+----" + "\n"
        );
    }
    public static void stage7() {
        System.out.print(
                "  _________\n"+
                "  |/      | \n"+
                "  |      (_) \n"+
                "  |      \\|/\n"+
                "  |       |\n"+
                "  |      / \\ \n"+
                "  |        \n"+
                "--+----" + "\n"
        );
    }
    public static void death() {
        System.out.print( ConsoleColors.RED_BOLD +
                "         .-~~~-.\n"+
                "       .'       `.\n"+
                "       |  R.I.P. |\n"+
                "       |         |\n"+
                "     \\\\|         |//\n"+
                "^^^^^^^^^^^^^^^^^^^^^^^^^\n"
                + ConsoleColors.RESET
        );
    }
    public static void won() {
        System.out.print( ConsoleColors.YELLOW_BOLD +
                "   .-=========-.\n" +
                "   \\'-=======-'/\n" +
                "   _|   .=.   |_\n" +
                "  ((|  {{1}}  |))\n" +
                "   \\|   /|\\   |/\n" +
                "    \\__ '`' __/\n" +
                "      _`) (`_\n" +
                "    _/_______\\_\n" +
                "   /___________\\ \n" + ConsoleColors.RESET
        );
    }
}
