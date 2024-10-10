package Factory;

import Employee.Employee;
import Employee.FullTimeEmployee;
import Employee.PartTimeEmployee;

/**
 * This class is responsible for returning different Employee objects
 */
public class EmployeeFactory {

    /**
     * Returns a different instance of Employee dependent on the parameter that is passed
     * @param type The type of the employee you want to return
     * @return The Employee type you requested
     */
    public static Employee newEmployee(String type) {
        if(type.equalsIgnoreCase("parttime")){
            return new PartTimeEmployee();
        } else if(type.equalsIgnoreCase("fulltime")){
            return new FullTimeEmployee();
        } else throw new IllegalArgumentException("Invalid Employee Type: " + type);
    }

}
