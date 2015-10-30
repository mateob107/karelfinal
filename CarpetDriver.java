import kareltherobot.*;

public class CarpetDriver implements Directions
{
   public static void main(String[] args)
   {
        World.reset();
        World.setDelay(100);
        World.readWorld("carpetWorld.kwld");
        World.setTrace(true);
        World.setVisible(true);
       CarpetBot bot = new CarpetBot(1, 1, East, infinity);
       bot.work();
    }
}
