import kareltherobot.*;

public class Newspaper implements Directions{

    public static void main(String[] args) {
        World.readWorld("worlds/fig2-8.kwld");
        World.setVisible(true);
        World.setDelay(100);

        UrRobot bot = new UrRobot(3, 4,
                West, 0);

    }
}
