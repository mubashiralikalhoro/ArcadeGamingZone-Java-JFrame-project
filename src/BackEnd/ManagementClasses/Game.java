
package BackEnd.ManagementClasses;

public class Game {
    private String gameName;
    private int noOfTokensRequired;
    private int points;

    public Game(){}
    public Game(String gameName, int noOfTokensRequired, int points) {
        this.gameName = gameName;
        this.noOfTokensRequired = noOfTokensRequired;
        this.points = points;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getNoOfTokensRequired() {
        return noOfTokensRequired;
    }

    public void setNoOfTokensRequired(int noOfTokensRequired) {
        this.noOfTokensRequired = noOfTokensRequired;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
}
