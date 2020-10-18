import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TFlipperTest {
    private static TFlipper tFlipper = new TFlipper(false, false);

    @Parameterized.Parameter(0)
    public boolean t;

    @Parameterized.Parameter(1)
    public boolean qt;

    @Parameterized.Parameter(2)
    public boolean qt1;

    @Parameterized.Parameters
    public static Collection<Boolean[]> data() {
        Boolean[][] data = new Boolean[][] {
                {false, false, false},
                {false, true, true},
                {true, false, true},
                {true, true, false}
        };
        return Arrays.asList(data);
    }

    @Test
    public void testFlipQ() {
        // Started value of Q is 0 or FALSE

        tFlipper.setT(t);
        tFlipper.setQ(qt);
        assertEquals(qt1, tFlipper.flipQ(tFlipper.isT()));
        System.out.println(tFlipper.toString());
    }
}