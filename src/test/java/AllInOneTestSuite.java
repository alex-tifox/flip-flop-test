import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        JkFlipperTest.class,
        DFlipperTest.class,
        TFlipperTest.class,
        RsFlipperTest.class,
})
public class AllInOneTestSuite {
}
