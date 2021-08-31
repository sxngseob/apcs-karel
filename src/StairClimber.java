import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class StairClimber implements Directions {

    public static void main (String[] args)
    {
        World.readWorld("worlds/fig3-1.kwld");
        World.setVisible(true);
        World.setDelay(75);
        //World.showSpeedControl(true);

        int row = 1;
        int col = 1;
        UrRobot bot = new UrRobot(row, col,
                East, 1);

    }
}
