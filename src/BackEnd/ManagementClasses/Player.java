package BackEnd.ManagementClasses;

public class Player extends Person {
    
    private String password;
    private int noOfTokens;
    private int totalPurchase;
    private int wins;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private int losses;
    private String playerID;
    private String inGameName;
    private int score;
    private int level;

    public Player() {
    }

    public Player(String password,int noOfTokens, int totalPurchase, int wins, int losses, String playerID, String inGameName, int score, int level, String username, String email) {
        super(username, email);
        this.password=password;
        this.noOfTokens = noOfTokens;
        this.totalPurchase = totalPurchase;
        this.wins = wins;
        this.losses = losses;
        this.playerID = playerID;
        this.inGameName = inGameName;
        this.score = score;
        this.level = level;
    }

    public int getNoOfTokens() {
        return noOfTokens;
    }

    public void setNoOfTokens(int noOfTokens) {
        this.noOfTokens = noOfTokens;
    }

    public int getTotalPurchase() {
        return totalPurchase;
    }

    public void setTotalPurchase(int totalPurchase) {
        this.totalPurchase = totalPurchase;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getInGameName() {
        return inGameName;
    }

    public void setInGameName(String inGameName) {
        this.inGameName = inGameName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Player{" + "noOfTokens=" + noOfTokens + ", totalPurchase=" + totalPurchase
                + ", wins=" + wins + ", losses=" + losses + ", playerID=" + playerID
                + ", inGameName=" + inGameName + ", score=" + score + ", level=" + level + super.toString() + "}";
    }

    public void addWin() {
        wins++;
    }

    public void addLoss() {
        losses++;
    }

    public void addScore(int scr) {
        score += scr;
        if ((double) score % 2500 == 0) {
            level++;
        }
    }

    public void addTokens(int tokens) {
        this.noOfTokens += tokens;
    }

    public void addPurchase(int purchase) {
        this.totalPurchase += purchase;
    }
    
    public void takeTokens(int toks){
        this.noOfTokens-=toks;
    }

}
