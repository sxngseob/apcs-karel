import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class Harvester implements Directions {

    public static void main (String[] args)
    {
        World.readWorld("worlds/fig3-2.kwld");
        World.setVisible(true);
        World.setDelay(75);
        //World.showSpeedControl(true);

        int row = 2;
        int col = 2;
        UrRobot bot = new UrRobot(row, col,
                East, 1);

    }
}
