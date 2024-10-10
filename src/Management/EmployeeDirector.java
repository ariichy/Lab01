package Management;

import Builder.EmployeeBuilder;
import Builder.FullTimeEmployeeBuilder;
import Builder.PartTimeEmployeeBuilder;
import Employee.Employee;

/**
 * This class is responsible for managing the construction process of Employees
 */
public class EmployeeDirector {

    EmployeeBuilder ptBuilder = new PartTimeEmployeeBuilder();
    EmployeeBuilder ftBuilder = new FullTimeEmployeeBuilder();
    EmployeeManager manage = EmployeeManager.getInstance();

    /**
     * Creates an Employee by setting its attribute values using an EmployeeBuilder
     * @param builder to set Employee attributes
     * @return The created Employee
     */
    public Employee createEmp(EmployeeBuilder builder) {
        builder.id(9);
        builder.name("Sam Smith");
        builder.department("Welcome Services");
        builder.role("Greeter");
        builder.workingHoursPerWeek(16);
        builder.salary(12500);
        return builder.build();
    }

}
