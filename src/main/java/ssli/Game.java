package ssli;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Skander on 09/03/2015.
 */
public class Game {

    private final static int NB_FRAMES = 10;
    public static final int DEFAULT_NB_PINS = 10;

    private List<Frame> frames = new ArrayList<Frame>();
    private String summary;

    public Game() {
        summary = "";
        for (int i=0; i<NB_FRAMES; i++) {
            frames.add(new Frame());
        }
    }

    public String getSummary() {
        return summary;
    }

    /**
     * Simulate a bowling game.
     * @return the final score.
     */
    public int play () {
        int score = 0;
        FrameResult result;
        for (Frame frame : frames) {
            result = frame.playFrame();
            //TODO handle strike on last frame and add new frames accordingly
            summary += result.toString();
            //TODO update score
        }
        return score;
    }
}
