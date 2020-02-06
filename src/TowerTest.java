/**
 * @author Vita.Wiebe@seattlecolleges.edu;
 * A class to test our methods;
 */
public class TowerTest {


    public static void main(String[] args) {

        // Create instance of our TowersOfHanoi object to use to test solveTowers method implementation;
        TowersOfHanoi test1 = new TowersOfHanoi(3, 0);
        // Initialize startPole, endPole, and tempPole with the String versions of numbers denoting
        // their tower number;
        test1.solveTowers(test1.getTotalDisks(), "1", "2", "3");
    }
}
