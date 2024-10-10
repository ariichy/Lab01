package Builder;
import Employee.Employee;

/**
 * This class is responsible for defining the contract that
 * all EmployeeBuilders must implement
 */
public interface EmployeeBuilder {

    /**
     * Methods for setting all Employee attributes
     */
    EmployeeBuilder id(int id);
    EmployeeBuilder name(String name);
    EmployeeBuilder department(String department);
    EmployeeBuilder role(String role);
    EmployeeBuilder workingHoursPerWeek(double workingHoursPerWeek);
    EmployeeBuilder salary(double salary);
    Employee build();

}
