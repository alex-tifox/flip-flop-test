import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DFlipperTest {
    private static DFlipper dFlipper = new DFlipper();

    @Parameterized.Parameter(0)
    public boolean d;

    @Parameterized.Parameter(1)
    public boolean qt;

    @Parameterized.Parameter(2)
    public boolean qt1;

    @Parameterized.Parameters
    public static Collection<Boolean[]> data() {
        Boolean[][] data = new Boolean[][] {
                {false, false, false},
                {false, true, false},
                {true, false, true},
                {true, true, true}
        };
        return Arrays.asList(data);
    }

    @Test
    public void testFlipQ() {
        // Started value of Q is 0 or FALSE
        dFlipper.setD(d);
        dFlipper.setQ(qt);
        assertEquals(qt1, dFlipper.flipQ(dFlipper.isD()));

        System.out.println(dFlipper.toString());
    }
}