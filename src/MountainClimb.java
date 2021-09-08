import kareltherobot.*;
import java.awt.Color;

public class MountainClimb implements Directions {
  public static void main (String[] args)
  {
    World.readWorld("worlds/fig2-9.kwld");
    World.setVisible(true);
    World.setDelay(30);
    //World.showSpeedControl(true);
    
    int row = 1; 
    int col = 2;
    UrRobot bot = new UrRobot(row, col,
                                North, 1);
    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();
    bot.move();

    bot.turnLeft();
    bot.move();
    bot.move();


    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();
    bot.move();

    bot.turnLeft();
    bot.move();
    bot.move();


    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();
    bot.move();
    bot.move();


    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();
    bot.move();
    bot.move();


    bot.turnLeft();
    bot.move();



    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();
    bot.move();
    bot.move();




  }
  
}
