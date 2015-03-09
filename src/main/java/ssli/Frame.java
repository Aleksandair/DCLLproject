package ssli;

/**
 * Created by Skander on 09/03/2015.
 */
public class Frame {


    private int nbPinLeft;

    public Frame() {
        this.nbPinLeft = Game.DEFAULT_NB_PINS;
    }

    /**
     * Simulate a throw.
     * @param nbPinLeft Number of pins left
     * @return The number of pins left after the throw.
     */
    private int throwBall (int nbPinLeft) {
        // TODO properly simulate the throw
        return 5;
    }

    /**
     * Simulate a frame : throws and if it's not a strike, it makes a second throw.
     * @return the result of the frame
     */
    public FrameResult playFrame () {
        int first = throwBall(nbPinLeft);
        int second = throwBall(nbPinLeft);

        FrameResult result = new FrameResult(first, second);
        // TODO play and update result
        return result;
    }
}
