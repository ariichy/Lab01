package Employee;

/**
 * This class is responsible for defining the attributes and methods that employees will use
 */
public abstract class Employee {

    int id;
    String name;
    String department;
    String role;
    double workingHoursPerWeek;
    double salary;

    public abstract void clockIn();

    public abstract void clockOut();

    public abstract void trackWorkHours();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                ", workingHoursPerWeek=" + workingHoursPerWeek +
                ", salary=" + salary +
                '}';
    }
}
