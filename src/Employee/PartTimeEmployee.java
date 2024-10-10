package Employee;

import Builder.PartTimeEmployeeBuilder;

/**
 * This class is responsible for defining how a part-time employee can be constructed,
 * and implementing the abstract methods from its
 * super-class
 */
public class PartTimeEmployee extends Employee{

    /**
     * Predefines a default part-time employee
     */
    public PartTimeEmployee(){
        id = 6;
        name = "John Doe";
        department = "Human Resources";
        role = "Hiring Manager";
        workingHoursPerWeek = 24;
        salary = 35000;
    }

    /**
     * Allows a part-time employee to be constructed using an
     * EmployeeBuilder
     * @param build
     */
    public PartTimeEmployee(PartTimeEmployeeBuilder build) {
        id = build.id;
        name = build.name;
        department = build.department;
        role = build.role;
        workingHoursPerWeek = build.workingHoursPerWeek;
        salary = build.salary;
    }

    /**
     * Allows a part-time employee to clock in
     */
    @Override
    public void clockIn() {
    }

    /**
     * Allows a part-time employee to clock out
     */
    @Override
    public void clockOut() {
    }

    /**
     * Tracks the work hours of a part-time employee
     */
    @Override
    public void trackWorkHours() {
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{} " + super.toString();
    }
}
