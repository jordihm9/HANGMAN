package hangman;

public class Player {
    private String nickName;
    private String name;
    private int wins = 0;
    private int loses = 0;

    public Player(String nickName, String name) {
        this.nickName = nickName;
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }
}
