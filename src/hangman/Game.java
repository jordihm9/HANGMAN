package hangman;

import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players = new ArrayList<Player>();
    private ArrayList<Round> rounds = new ArrayList<Round>();

    public Game(){}

    public Player addPlayer() {
        String nickname = null;
        Menus.informing("Creating user...");
        do {
            Menus.asking("Enter your nickname: ");
            nickname = Main.in.next();
        } while (this.userExists(nickname));
        Menus.asking("Enter your name: ");
        String name = Main.in.next();
        Player player = new Player(nickname, name);
        players.add (player);
        Menus.informing("User created");
        return player;
    }

    public Player findPlayer(String nickname) {
        Player playerFound = null;
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getNickName().equals(nickname)) {
                playerFound = players.get(i);
                break;
            }
        }
        if (playerFound == null) {
            Menus.warning("Nickname not found");
        } else {
            Menus.informing("Login successful!");
        }
        return playerFound;
    }

    public boolean userExists(String nickname) {
        Player playerFound = null;
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getNickName().equals(nickname)) {
                playerFound = players.get(i);
                break;
            }
        }
        if (playerFound == null) {
            return false;
        } else {
            Menus.warning("This nickname already exists, please pick a different one");
            return true;
        }
    }

    public Round addRound(Round round) {
        rounds.add(round);
        return round;
    }

    public void showHistoric() {
        for (int i = 0; i < rounds.size(); i++) {
            System.out.print(
                    "| "+ i +" | " +
                    rounds.get(i).getPlayer().getNickName() +" | " +
                    rounds.get(i).getErrors() +" errors |\n"
            );
        }
    }

    public void showRanking() {
        for (int i = 0; i < players.size(); i++) {
            System.out.print(
                    "| " + players.get(i).getNickName() +
                    " | Wins: " + players.get(i).getWins() +
                    " | Loses: " + players.get(i).getLoses() + "\n"
            );
        }
    }

    public void startPlaying(Player player) {
        boolean continuePlaying = true;
        char option;
        do {
            boolean win = this.addRound(new Round(new Word(ApiConnect.randomWord()), player)).startRound();
            if (win) {
                this.findPlayer(player.getNickName()).setWins(player.getWins()+1);
            } else {
                this.findPlayer(player.getNickName()).setLoses(player.getLoses()+1);
            }
            Menus.asking("Continue playing? [Y/N] ");
            option = Main.in.next().toUpperCase().charAt(0);
            if (option == 'N') {
                continuePlaying = false;
            } else if (option == 'Y'){} else {
                Menus.warning("Please insert [Y/N]");
            }
        } while(continuePlaying);
    }
}
