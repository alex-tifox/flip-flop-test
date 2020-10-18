import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class JkFlipperTest {
    private static final JkFlipper jkFlipper = new JkFlipper(true, true, true);

    @Parameterized.Parameter()
    public boolean j;

    @Parameterized.Parameter(1)
    public boolean k;

    @Parameterized.Parameter(2)
    public boolean q;

    @Parameterized.Parameters
    public static Collection<Boolean[]> data() {
        Boolean[][] data = new Boolean[][] {
                {false, false, jkFlipper.isQ()},
                {false, true, false},
                {true, false, true},
                {true, true, !jkFlipper.isQ()}
        };
        return Arrays.asList(data);
    }

    @Test
    public void testFlipQ() {
        // Started value of Q is 1 or TRUE
        jkFlipper.setJ(j);
        jkFlipper.setK(k);
        assertEquals(q, jkFlipper.flipQ(jkFlipper.isJ(), jkFlipper.isK()));
        System.out.println(jkFlipper.toString());
    }
}