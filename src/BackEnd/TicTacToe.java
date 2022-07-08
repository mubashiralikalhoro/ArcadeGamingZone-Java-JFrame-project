package BackEnd;

import BackEnd.ManagementClasses.Game;
import java.util.ArrayList;
import java.util.Random;

public class TicTacToe extends Game {

    private Random random = new Random();
    private ArrayList<Integer> userMoves = new ArrayList<>();
    private ArrayList<Integer> computerMoves = new ArrayList<>();
    private ArrayList<Integer> availableMoves = new ArrayList<>();
    private ArrayList<Integer> availableCornors = new ArrayList<>();

    public TicTacToe() {
        super("TicTacToe",0,100);
        addingMoves();
    }

    public ArrayList<Integer> getAvailableMoves() {
        return availableMoves;
    }

    private void addingMoves() {
        for (int i = 0; i < 9; i++) {
            availableMoves.add(i);
        }
        availableCornors.add(0);
        availableCornors.add(2);
        availableCornors.add(6);
        availableCornors.add(8);
    }

    private void updateAvailableMoves(int a) {
        // removing the selected moves from the list
        availableMoves.remove(availableMoves.indexOf(a));
        if (availableCornors.contains(a)) {
            availableCornors.remove(availableCornors.indexOf(a));
        }
    }

    public void setUserMove(int a) {
        if (userMoves.size() < 5) {
            userMoves.add(a);
            updateAvailableMoves(a);
        }
    }
// Computer Moves

    public int getComputerMoveOne() {

        int m = getRandomFrom(availableMoves);
        computerMoves.add(m);
        return m;
    }

    public int getComputerMoveTwo() {
        int m = getRandomFrom(availableCornors);
        // blocking user
        if (checkAboutToWin()) {
            m = savingMove();
            computerMoves.add(m);
            return m;
        }
        //TODO: make the logic more strong
        int temp = genrateMove(0, 4, 8);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(0, 1, 2);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(0, 3, 6);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(2, 1, 0);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(2, 4, 6);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(2, 5, 8);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(6, 3, 0);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(6, 7, 8);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(6, 4, 2);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(8, 5, 2);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(8, 4, 0);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(8, 7, 6);
        if (temp != -1) {
            m = temp;
        }

        temp = genrateMove(1, 0, 2);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(1, 4, 7);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(3, 0, 6);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(3, 4, 5);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(5, 2, 8);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(5, 4, 3);
        if (temp != -1) {
            m = temp;
        }

        temp = genrateMove(7, 4, 1);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(7, 8, 6);
        if (temp != -1) {
            m = temp;
        }

        // genrating move for the middle part
        temp = genrateMove(4, 1, 7);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(4, 3, 5);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(4, 0, 8);
        if (temp != -1) {
            m = temp;
        }
        temp = genrateMove(4, 2, 6);
        if (temp != -1) {
            m = temp;
        }
        computerMoves.add(m);
        return m;
    }

    private int genrateMove(int a, int b, int c) {
        if (computerMoves.contains(a) && !userMoves.contains(b) && !userMoves.contains(c)) {
            return getRandomFrom(b, c);
        }
        return -1;
    }

    public int getComputerMoveThree() {
        int m = getRandomFrom(availableMoves);
        // trying to win
        if (checkComputerAboutToWin()) {
            m = tryToWin();
            computerMoves.add(m);
            return m;
        } // blocking user
        else if (checkAboutToWin()) {
            m = savingMove();
            computerMoves.add(m);
            return m;
        }
        return m;
    }

    public int getComputerMoveFour() {
        int m = getRandomFrom(availableMoves);
        // trying to win
        if (checkComputerAboutToWin()) {
            m = tryToWin();
            computerMoves.add(m);
            return m;
        } // trying to block user 
        else if (checkAboutToWin()) {
            m = savingMove();
            computerMoves.add(m);
            return m;
        }
        return m;
    }

// =================
    public boolean checkUserWin() {
        boolean r = false;
        // checking Horizontal
        if (userMoves.contains(0) && userMoves.contains(1) && userMoves.contains(2)) {
            r = true;
        }
        if (userMoves.contains(3) && userMoves.contains(4) && userMoves.contains(5)) {
            r = true;
        }
        if (userMoves.contains(6) && userMoves.contains(7) && userMoves.contains(8)) {
            r = true;
        }
        // checking Vertically
        if (userMoves.contains(0) && userMoves.contains(3) && userMoves.contains(6)) {
            r = true;
        }
        if (userMoves.contains(1) && userMoves.contains(4) && userMoves.contains(7)) {
            r = true;
        }
        if (userMoves.contains(2) && userMoves.contains(5) && userMoves.contains(8)) {
            r = true;
        }
        // checking diagonally
        if (userMoves.contains(0) && userMoves.contains(4) && userMoves.contains(8)) {
            r = true;
        }
        if (userMoves.contains(2) && userMoves.contains(4) && userMoves.contains(6)) {
            r = true;
        }
        return r;
    }

    public boolean checkComputerWin() {
        boolean r = false;
        // checking Horizontal
        if (computerMoves.contains(0) && computerMoves.contains(1) && computerMoves.contains(2)) {
            r = true;
        }
        if (computerMoves.contains(3) && computerMoves.contains(4) && computerMoves.contains(5)) {
            r = true;
        }
        if (computerMoves.contains(6) && computerMoves.contains(7) && computerMoves.contains(8)) {
            r = true;
        }
        // checking Vertically
        if (computerMoves.contains(0) && computerMoves.contains(3) && computerMoves.contains(6)) {
            r = true;
        }
        if (computerMoves.contains(1) && computerMoves.contains(4) && computerMoves.contains(7)) {
            r = true;
        }
        if (computerMoves.contains(2) && computerMoves.contains(5) && computerMoves.contains(8)) {
            r = true;
        }
        // checking diagonally
        if (computerMoves.contains(0) && computerMoves.contains(4) && computerMoves.contains(8)) {
            r = true;
        }
        if (computerMoves.contains(2) && computerMoves.contains(4) && computerMoves.contains(6)) {
            r = true;
        }
        return r;
    }

    private int tryToWin() {
        if (aboutToWin(0, 1, 2, 0)) {
            return 2;
        }
        if (aboutToWin(3, 4, 5, 0)) {
            return 5;
        }
        if (aboutToWin(6, 7, 8, 0)) {
            return 8;
        }

        if (aboutToWin(1, 2, 0, 0)) {
            return 0;
        }
        if (aboutToWin(4, 5, 3, 0)) {
            return 3;
        }
        if (aboutToWin(7, 8, 6, 0)) {
            return 6;
        }
        if (aboutToWin(0, 2, 1, 0)) {
            return 1;
        }
        if (aboutToWin(3, 5, 4, 0)) {
            return 4;
        }
        if (aboutToWin(6, 8, 7, 0)) {
            return 7;
        }

        if (aboutToWin(0, 3, 6, 0)) {
            return 6;
        }
        if (aboutToWin(1, 4, 7, 0)) {
            return 7;
        }
        if (aboutToWin(2, 5, 8, 0)) {
            return 8;
        }

        if (aboutToWin(3, 6, 0, 0)) {
            return 0;
        }
        if (aboutToWin(4, 7, 1, 0)) {
            return 1;
        }
        if (aboutToWin(5, 8, 2, 0)) {
            return 2;
        }

        if (aboutToWin(0, 6, 3, 0)) {
            return 3;
        }
        if (aboutToWin(1, 7, 4, 0)) {
            return 4;
        }
        if (aboutToWin(2, 8, 5, 0)) {
            return 5;
        }

        if (aboutToWin(0, 4, 8, 0)) {
            return 8;
        }
        if (aboutToWin(2, 4, 6, 0)) {
            return 6;
        }

        if (aboutToWin(4, 8, 0, 0)) {
            return 0;
        }
        if (aboutToWin(4, 6, 2, 0)) {
            return 2;
        }

        if (aboutToWin(0, 8, 4, 0)) {
            return 4;
        }
        if (aboutToWin(6, 2, 4, 0)) {
            return 4;
        }
        return -1;
    }

    private boolean aboutToWin(int a, int b, int c, int temp) {
        if (computerMoves.contains(a) && computerMoves.contains(b) && !userMoves.contains(c)) {
            return true;
        }
        return false;
    }

    private boolean checkComputerAboutToWin() {
        if (tryToWin() == -1) {
            return false;
        }
        return true;
    }

    private int savingMove() {
        if (aboutToWin(0, 1, 2)) {
            return 2;
        }
        if (aboutToWin(3, 4, 5)) {
            return 5;
        }
        if (aboutToWin(6, 7, 8)) {
            return 8;
        }

        if (aboutToWin(1, 2, 0)) {
            return 0;
        }
        if (aboutToWin(4, 5, 3)) {
            return 3;
        }
        if (aboutToWin(7, 8, 6)) {
            return 6;
        }
        if (aboutToWin(0, 2, 1)) {
            return 1;
        }
        if (aboutToWin(3, 5, 4)) {
            return 4;
        }
        if (aboutToWin(6, 8, 7)) {
            return 7;
        }

        if (aboutToWin(0, 3, 6)) {
            return 6;
        }
        if (aboutToWin(1, 4, 7)) {
            return 7;
        }
        if (aboutToWin(2, 5, 8)) {
            return 8;
        }

        if (aboutToWin(3, 6, 0)) {
            return 0;
        }
        if (aboutToWin(4, 7, 1)) {
            return 1;
        }
        if (aboutToWin(5, 8, 2)) {
            return 2;
        }

        if (aboutToWin(0, 6, 3)) {
            return 3;
        }
        if (aboutToWin(1, 7, 4)) {
            return 4;
        }
        if (aboutToWin(2, 8, 5)) {
            return 5;
        }

        if (aboutToWin(0, 4, 8)) {
            return 8;
        }
        if (aboutToWin(2, 4, 6)) {
            return 6;
        }

        if (aboutToWin(4, 8, 0)) {
            return 0;
        }
        if (aboutToWin(4, 6, 2)) {
            return 2;
        }

        if (aboutToWin(0, 8, 4)) {
            return 4;
        }
        if (aboutToWin(6, 2, 4)) {
            return 4;
        }
        return -1;
    }

    private int getRandomFrom(int a, int b) {
        int rand = random.nextInt(2);
        if (rand == 0) {
            return a;
        }
        return b;
    }

    private boolean aboutToWin(int userMoveA, int userMoveB, int computerMove) {
        if (userMoves.contains(userMoveA) && userMoves.contains(userMoveB) && !computerMoves.contains(computerMove)) {
            return true;
        }
        return false;
    }

    private boolean checkAboutToWin() {
        if (savingMove() == -1) {
            return false;
        }
        return true;
    }

    private int getRandomFrom(ArrayList<Integer> list) {
        return list.get(random.nextInt(list.size()));
    }

    public boolean checkUnique(int a) {
        boolean r = true;
        // Checking user Moves
        for (int i : userMoves) {
            if (i == a) {
                r = false;
                break;
            }
        }
        
        
        // Checking computer Moves
        for (int i : computerMoves) {
            if (i == a) {
                r = false;
                break;
            }
        }
        return r;
    }

}
