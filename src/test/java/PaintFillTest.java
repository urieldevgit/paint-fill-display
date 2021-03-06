import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class PaintFillTest {

    PaintFill paintFill;

    @Before
    public void setUp() {
        paintFill = new PaintFill();
    }

    @Test
    public void testPaintDisplay() {
        int display[][] = {
                {8, 8, 4, 8},
                {8, 0, 0, 8},
                {8, 0, 0, 8},
                {8, 0, 0, 8}};

        int displayAfterPainted[][] = {
                {8, 8, 4, 8},
                {8, 1, 1, 8},
                {8, 1, 1, 8},
                {8, 1, 1, 8}};

        int oldColor = display[2][1];
        int newColor = 1;

        paintFill.changeOldColorWithNewOne(display, oldColor, newColor, 2, 1);

        Assert.assertTrue(Arrays.deepEquals(display, displayAfterPainted));

    }
}
