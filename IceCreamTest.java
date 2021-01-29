

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class IceCreamTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class IceCreamTest
{
    private IceCream iceCream1;

    /**
     * Default constructor for test class IceCreamTest
     */
    public IceCreamTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        iceCream1 = new IceCream("Mint Chocolate Chip", "2 Scoops", true);
        iceCream1.printProductInfo();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
