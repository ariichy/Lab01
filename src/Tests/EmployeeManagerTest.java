package Tests;

import Management.EmployeeManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * This class tests the method(s) in EmployeeManager
 */
public class EmployeeManagerTest {

    /**
     * Tests to confirm that both instances are the same, confirming
     * that only one instance is created
     */
    @Test
    void EmployeeManagerSingletonTest() {
        EmployeeManager firstInstance = EmployeeManager.getInstance();
        EmployeeManager secondInstance = EmployeeManager.getInstance();
        assertSame(firstInstance, secondInstance);
    }

}
