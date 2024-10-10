package Tests;

import Employee.FullTimeEmployee;
import Employee.PartTimeEmployee;
import Factory.EmployeeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class tests the method(s) in EmployeeFactory
 */
public class EmployeeFactoryTest {

    /**
     * Used to access the static method in EmployeeFactory inside each test
     */
    EmployeeFactory factory;

    /**
     * Tests that when "parttime" is passed to newEmployee(), a part-time
     * employee is returned
     */
    @Test
    void PartTimeEmployeeTest() {
        assertTrue(factory.newEmployee("parttime") instanceof PartTimeEmployee);
    }

    /**
     * Tests that when "fulltime" is passed to newEmployee() a full-time
     * employee is returned
     */
    @Test
    void FullTimeEmployeeTest() {
        assertTrue(factory.newEmployee("fulltime") instanceof FullTimeEmployee);
    }
}
