

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DrinksTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DrinksTest
{
    private Drinks drinks1;

    /**
     * Default constructor for test class DrinksTest
     */
    public DrinksTest()
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
        drinks1 = new Drinks("Diet Pepsi", "Small", false);
        drinks1.printProductInfo();
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
