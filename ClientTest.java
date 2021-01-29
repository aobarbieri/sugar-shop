

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ClientTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClientTest
{
    private Client client1;

    /**
     * Default constructor for test class ClientTest
     */
    public ClientTest()
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
        client1 = new Client();
        client1.setClientsFile();
        client1.setClientsListToFile();
        client1.printClientList();
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
