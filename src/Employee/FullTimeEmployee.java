package Employee;

import Builder.FullTimeEmployeeBuilder;

/**
 * This class is responsible for defining how a full-time employee can be constructed,
 * and implementing the abstract methods from its super-class
 */
public class FullTimeEmployee extends Employee{

    /**
     * Defines a default employee with all attributes set
     */
    public FullTimeEmployee(){
        id = 8;
        name = "Jane Doe";
        department = "Sales";
        role = "Team Lead";
        workingHoursPerWeek = 37.5;
        salary = 80000;
    }

    /**
     * Allows a full-time employee to be constructed using an EmployeeBuilder
     * @param build
     */
    public FullTimeEmployee(FullTimeEmployeeBuilder build) {
        id = build.id;
        name = build.name;
        department = build.department;
        role = build.role;
        workingHoursPerWeek = build.workingHoursPerWeek;
        salary = build.salary;
    }

    /**
     * Allows a full-time employee to clock in
     */
    @Override
    public void clockIn() {
    }

    /**
     * Allows a full-time employee to clock out
     */
    @Override
    public void clockOut() {
    }

    /**
     * Tracks the work hours of a full-time employee
     */
    @Override
    public void trackWorkHours() {
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{} " + super.toString();
    }
}
