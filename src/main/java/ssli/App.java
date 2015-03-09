package ssli;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Game game = new Game();
        int score = game.play();
        String summary = game.getSummary();

        System.out.println(summary + " => " + score);
    }
}
