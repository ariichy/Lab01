package Management;

import Employee.Employee;
import java.util.ArrayList;

/**
 * This class is responsible for the management of employees.
 * Capable of adding, removing, and retrieving employees.
 */
public class EmployeeManager {

    private static EmployeeManager manager;

    /**
     * Private constructor to prevent multiple instantiations
     */
    private EmployeeManager(){};

    /**
     * Checks if there is already an instance of EmployeeManager
     * instantiated and if not, returns a new instance
     *
     * @return An EmployeeManager object
     */
    public static EmployeeManager getInstance() {
        if(manager == null) {
            manager = new EmployeeManager();
        }
        return manager;
    }

    ArrayList<Employee> list = new ArrayList<>();

    /**
     * Adds an Employee to the ArrayList
     *
     * @param emp
     */
    public void addEmp(Employee emp){
        list.add(emp);
    }

    /**
     * Removes an Employee from the ArrayList
     *
     * @param emp
     */
    public void removeEmp(Employee emp){
        list.remove(emp);
    }

    /**
     * Displays all Employees in the ArrayList
     */
    public void retrieveEmp() {
        for (Employee emp : list) {
            System.out.println(emp + ", ");
        }
    }
}
