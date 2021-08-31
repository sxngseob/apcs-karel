import kareltherobot.*;

public class ShoppingBag implements Directions {

    public static void main (String[] args)
    {
        World.readWorld("worlds/fig2-10.kwld");
        World.setVisible(true);
        World.setDelay(75);
        //World.showSpeedControl(true);

        int row = 5;
        int col = 7;
        UrRobot bot = new UrRobot(row, col,
                East, 0);

    }
}
