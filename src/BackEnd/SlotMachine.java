package BackEnd;

import java.util.Random;

/**
 *
 * @author Mubashir Ali
 */
public class SlotMachine {

    private int[] nums = new int[3];
    private int prize = 0;
    private int score = 10;

    public SlotMachine() {
        Random random = new Random();
        nums[0] = random.nextInt(7) + 1;
        nums[1] = random.nextInt(7) + 1;
        nums[2] = random.nextInt(7) + 1;
        genratePrize();
    }

    public int[] getNums() {
        return nums;
    }

    public int getScore() {
        return score;
    }

    public int getPrize() {
        return prize;
    }

    private void genratePrize() {
        if (nums[0] == 1 && nums[1] == 1 && nums[2] == 1) {
            prize = 10;
            score = 1000;
        } else if (nums[0] == 2 && nums[1] == 2 && nums[2] == 2) {
            prize = 20;
            score = 2000;
        } else if (nums[0] == 3 && nums[1] == 3 && nums[2] == 3) {
            prize = 30;
            score = 3000;
        } else if (nums[0] == 4 && nums[1] == 4 && nums[2] == 4) {
            prize = 40;
            score = 4000;
        } else if (nums[0] == 5 && nums[1] == 5 && nums[2] == 5) {
            prize = 50;
            score = 5000;
        } else if (nums[0] == 6 && nums[1] == 6 && nums[2] == 6) {
            prize = 60;
            score = 6000;
        } else if (nums[0] == 7 && nums[1] == 7 && nums[2] == 7) {
            prize = 100000;
            score = 10000;
        }
    }

}
