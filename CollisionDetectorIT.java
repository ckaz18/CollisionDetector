g.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christi Kazakov
 */
public class CollisionDetectorIT {
    
    public CollisionDetectorIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of detectCollision method, of class CollisionDetector.
     */
    @Test
    public void testDetectCollision() {
        System.out.println("detectCollision");
        Aircraft thisAirCraft = null;
        Aircraft[] otherAirCraft = null;
        CollisionDetector instance = null;
        instance.detectCollision(thisAirCraft, otherAirCraft);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
