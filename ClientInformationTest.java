

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ClientInformationTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClientInformationTest
{
    private ClientInformation clientIn1;

    /**
     * Default constructor for test class ClientInformationTest
     */
    public ClientInformationTest()
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
        clientIn1 = new ClientInformation();
        clientIn1.setReaderToArray();
        clientIn1.printClientList();
        clientIn1.setAlphabetically();
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
