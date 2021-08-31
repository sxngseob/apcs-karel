import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class Rearranger implements Directions {

    public static void main (String[] args)
    {
        World.readWorld("worlds/fig2-11.kwld");
        World.setVisible(true);
        World.setDelay(75);
        //World.showSpeedControl(true);

        int row = 4;
        int col = 3;
        UrRobot bot = new UrRobot(row, col,
                North, 0);

    }
}
