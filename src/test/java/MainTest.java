import org.testng.Assert;
import org.testng.annotations.Test;
import ru.goinvest.trade.Main;

public class MainTest {
    @Test
    public static void testMakeLeftPad() {
        Assert.assertEquals(Main.makeLeftPad("str"), Main.makeLeftPad(" str"));
        Assert.assertEquals("    ", "    ");
        Assert.assertEquals("  lo", "  lo");
        Assert.assertEquals(" lon", " lon");
        Assert.assertEquals(" lon", " lon");

    }
}
