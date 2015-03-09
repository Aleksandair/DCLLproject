package ssli;

/**
 * Created by Skander on 09/03/2015.
 */
public class FrameResult {
    private int first;
    private int second;

    public FrameResult(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        String s;
        // Test Strike
        if (first == Game.DEFAULT_NB_PINS) {
            s = "X";
        } else {
            s = (first == 0) ? "_" : String.valueOf(first);
            // Test Spare
            if (first + second == Game.DEFAULT_NB_PINS) {
                s += "/";
            } else {
                s += (second == 0) ? "_" : String.valueOf(second);
            }
        }
        return s;
    }
}
