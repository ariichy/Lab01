package Tests;

import Builder.EmployeeBuilder;
import Builder.FullTimeEmployeeBuilder;
import Builder.PartTimeEmployeeBuilder;
import Employee.FullTimeEmployee;
import Employee.PartTimeEmployee;
import Management.EmployeeDirector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class tests the method(s) in EmployeeDirector
 */
public class EmployeeDirectorTest {

    /**
     * Creates the objects needed to complete the tests
     */
    EmployeeDirector director = new EmployeeDirector();
    EmployeeBuilder partTime = new PartTimeEmployeeBuilder();
    EmployeeBuilder fullTime = new FullTimeEmployeeBuilder();

    /**
     * Tests to confirm when a part-time builder is passed, a part-time
     * employee is created
     */
    @Test
    void createPartTimeEmployeeTest() {
        assertTrue(director.createEmp(partTime) instanceof PartTimeEmployee);
    }

    /**
     * Tests to confirm when a full-time builder is passed, a full-time
     * employee is created
     */
    @Test
    void createFullTimeEmployeeTest() {
        assertTrue(director.createEmp(fullTime) instanceof FullTimeEmployee);
    }
}
