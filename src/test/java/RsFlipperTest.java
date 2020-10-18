import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class RsFlipperTest {

    private static final RsFlipper rsFlipper = new RsFlipper(false);

    @Parameterized.Parameter()
    public boolean s;

    @Parameterized.Parameter(1)
    public boolean r;

    @Parameterized.Parameter(2)
    public boolean q;

    @Parameterized.Parameters
    public static Collection<Boolean[]> data() {
        Boolean[][] data = new Boolean[][] {
                {false, false, rsFlipper.isQ()},
                {true, false, true},
                {false, true, false},
                {true, true, true},
        };
        return Arrays.asList(data);
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testFlipQ() {
        // Started value of Q is 1 or TRUE
        rsFlipper.setS(s);
        rsFlipper.setR(r);
        if (s && r) {
            exceptionRule.expect(IllegalArgumentException.class);
            System.out.println("Exception was thrown");
        }
        assertEquals(q, rsFlipper.flipQ(rsFlipper.isS(), rsFlipper.isR()));
        System.out.println(rsFlipper.toString());
    }
}