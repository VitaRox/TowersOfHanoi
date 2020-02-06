import java.util.*;

/**
 * @author Vita.Wiebe@seattlecolleges.edu
 * A class to implement the 2 different algorithms for the Tower of Hanoi
 * problem that we discussed in class;
 */
public class TowersOfHanoi {

    // Fields:

    // 'totalDisks' is the number of disks that must be moved;
    private int totalDisks;

    /*
     'count' is the number of times the method calls itself recursively;
     Declared 'static' since used by/referred to by multiple instances of the class
     potentially;
    */
    private static int count;

    /**
     * Class constructor;
     *
     * @param nDisks the number of disks that must be moved;
     */
    public TowersOfHanoi(int nDisks, int count) {

        nDisks = this.totalDisks;
        count = this.count;
    }

    /**
     *
     * @return total disks in this iteration;
     */
    public int getTotalDisks() {
        return this.totalDisks;
    }

    /**
     *
     * @return The number of recursive calls made to solveTowers();
     */
    public int getCount() {
        return count;
    }


    public void solveTowers(int nDisks, String startPole, String endPole, String tempPole) {

        // Strings to represent each of the 3 towers;
//        startPole = "1";
//        endPole = "2";
//        tempPole = "3";
        // Here we increment our field 'count' to reflect the number of recursive calls of our method;
        count++;
        while(nDisks > 0) {
            if (nDisks == 1) {
                System.out.println("Move disk " + nDisks + " from " + startPole + " to " + endPole);
            } else {
                solveTowers(nDisks - 1, startPole, tempPole, endPole);
                System.out.println("Move disk " + nDisks + " from " + startPole + " to " + endPole);
                solveTowers(nDisks - 1, tempPole, endPole, startPole);
            }
        }
        System.out.println("Tower of size " + nDisks + " solved using " + getCount() + " recursive calls to" +
                "solveTowers() method.");;

    }

}
