package Builder;

import Employee.Employee;
import Employee.FullTimeEmployee;

/**
 * This class is responsible for the actual construction of a FullTimeEmployee
 */
public class FullTimeEmployeeBuilder implements EmployeeBuilder{

    public int id;
    public String name;
    public String department;
    public String role;
    public double workingHoursPerWeek;
    public double salary;

    /**
     * Sets the EmployeeBuilder id
     * @param id
     * @return
     */
    @Override
    public EmployeeBuilder id(int id) {
        this.id = id;
        return this;
    }

    /**
     * Sets the EmployeeBuilder name
     * @param name
     * @return
     */
    @Override
    public EmployeeBuilder name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Sets the EmployeeBuilder department
     * @param department
     * @return
     */
    @Override
    public EmployeeBuilder department(String department) {
        this.department = department;
        return this;
    }

    /**
     * Sets the EmployeeBuilder role
     * @param role
     * @return
     */
    @Override
    public EmployeeBuilder role(String role) {
        this.role = role;
        return this;
    }

    /**
     * Sets the EmployeeBuilder workingHoursPerWeek
     * @param workingHoursPerWeek
     * @return
     */
    @Override
    public EmployeeBuilder workingHoursPerWeek(double workingHoursPerWeek) {
        this.workingHoursPerWeek = workingHoursPerWeek;
        return this;
    }

    /**
     * Sets the EmployeeBuilder salary
     * @param salary
     * @return
     */
    @Override
    public EmployeeBuilder salary(double salary) {
        this.salary = salary;
        return this;
    }

    /**
     * Takes all the set EmployeeBuilder attributes and returns them set to a FullTimeEmployee
     * @return
     */
    public Employee build(){
        return new FullTimeEmployee(this);
    }

    @Override
    public String toString() {
        return "PartTimeEmployeeBuilder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                ", workingHoursPerWeek=" + workingHoursPerWeek +
                ", salary=" + salary +
                '}';
    }
}
