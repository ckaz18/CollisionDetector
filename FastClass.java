import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christi Kazakov
 */
public class FastClass {
        /** xyz velocities */
    private static final double[] HEADING1 = {0.0, 1200.0, 0.0};
    /** latitude, longitude, and altitude */
    private static final double[] LOCATION1 = {0.0, 0.0, 1000.0};
    /** xyz velocities */
    private static final double[] HEADING2 = {-1200.0, 0.0, 0.0};
    /** latitude, longitude, and altitude */
    private static final double[] LOCATION2 = {550.0, 550.0, 2000.0};
    /** xyz velocities */
    private static final double[] HEADING3 = {900.0, 900.0, 900.0};
    /** latitude, longitude, and altitude */
    private static final double[] LOCATION3 = {550.0, 550.0, 1000.0};

    /** Value for a warning level corresponding to no warning */
    private static final int WARNING_LEVEL_GREEN = 0;


    /** Ownship test object */
    private final Aircraft thisPlane = new Aircraft("thisPlane", HEADING1,
            LOCATION1, WARNING_LEVEL_GREEN);
    /** Other aircraft test object */
    private final Aircraft otherPlaneA = new Aircraft("otherPlane", HEADING2,
            LOCATION2, WARNING_LEVEL_GREEN);
    /** Another aircraft test object */
    private final Aircraft otherPlaneB = new Aircraft("otherPlane", HEADING3,
            LOCATION3, WARNING_LEVEL_GREEN);
}
 
@Test
public void testVelocity(){
   System.out.println("Testing Fast Velocity");
    Collision expResult = null; 
    Collision result;
    WarningLevelCalculator warning = new WarningLevelCalculator();
    result = warning.detectCollision(thisPlane, otherPlaneA);
    assertEquals(expResult, result);
    System.out.println(expResult, result);

    Collision result2;
    result2 = warning.detectCollision(otherPlaneA, otherPlaneB);
    assertEquals(expResult, result2);
}

