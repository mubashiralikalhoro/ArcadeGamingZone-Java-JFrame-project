package BackEnd;

import BackEnd.ManagementClasses.Game;
import java.util.Random;

/**
 *
 * @author Mubashir Ali
 */
public class RockPaperSessior extends Game {

    private int userMove;
    private int computerMove;
    private int winingCondition;
    private Random random = new Random();
    private String[] moves = {"Rock", "Paper", "Sessior"};
    private String[] winingRules = {"Sessior cuts the paper!", "Paper wraps the rock!", "Rock Blunts the sessior!", "Draw!"};

    public RockPaperSessior(int userMove) {
        super("RockPaperSessior", 0, 50);
        if (userMove < 3) {
            this.userMove = userMove;
        } else {
            this.userMove = userMove % 3;
        }
        computerMove = random.nextInt(3);
    }

    public String checkUserWin() {
        String r = "Draw";
        if (userMove == 0 && computerMove == 1) {
            r = "AI Won";
            winingCondition = 1;
        } else if (userMove == 0 && computerMove == 2) {
            winingCondition = 2;
            r = "You Won";
        } else if (userMove == 1 && computerMove == 0) {
            r = "You Won";
            winingCondition = 1;
        } else if (userMove == 1 && computerMove == 2) {
            r = "AI Won";
            winingCondition = 0;
        } else if (userMove == 2 && computerMove == 0) {
            r = "AI Won";
            winingCondition = 2;
        } else if (userMove == 2 && computerMove == 1) {
            r = "You Won";
            winingCondition = 0;
        } else {
            winingCondition = 3;
        }
        return r;
    }

    public String winingCondition() {
        return winingRules[winingCondition];
    }

    public String getComputerMove() {
        return moves[computerMove];
    }

    public String getUserMove() {
        return moves[userMove];
    }

}
