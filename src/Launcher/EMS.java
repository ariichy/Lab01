package Launcher;

import Builder.EmployeeBuilder;
import Builder.FullTimeEmployeeBuilder;
import Builder.PartTimeEmployeeBuilder;
import Employee.Employee;
import Factory.EmployeeFactory;
import Management.EmployeeDirector;
import Management.EmployeeManager;

public class EMS {

    public static void main(String[] args) {

        // Creates an EmployeeDirector object to be used to access its methods
        EmployeeDirector director = new EmployeeDirector();

        // Creates a FullTimeEmployeeBuilder object
        EmployeeBuilder ftBuilder = new FullTimeEmployeeBuilder();

        // Creates a PartTimeEmployeeBuilder object
        EmployeeBuilder ptBuilder = new PartTimeEmployeeBuilder();

        // Creates an EmployeeManager used to manage newly created employees
        EmployeeManager manager = EmployeeManager.getInstance();

        // Creates a part-time employee using the EmployeeFactory
        Employee partTimer = EmployeeFactory.newEmployee("parttime");
        // Adds 'partTimer' to the EmployeeManager list
        manager.addEmp(partTimer);

        // Creates a full-time employee using the EmployeeFactory
        Employee fullTimer = EmployeeFactory.newEmployee("fulltime");
        // Adds 'fullTimer' to the EmployeeManager list
        manager.addEmp(fullTimer);

        // Creates a full-time employee using the method within EmployeeDirector,
        // and immediately adds it to the EmployeeManager list
        manager.addEmp(director.createEmp(ftBuilder));

        // Creates a part-time employee using the method within EmployeeDirector,
        // and immediately adds it to the EmployeeManager list
        manager.addEmp(director.createEmp(ptBuilder));

        // Creates a part-time employee using a PartTimeEmployeeBuilder with unique values for attributes
        Employee ptEmp = ptBuilder
                .id(4)
                .name("Joe")
                .workingHoursPerWeek(40)
                .role("Help Desk")
                .department("IT")
                .salary(62500)
                .build();
        // Adds ptEmp to the EmployeeManager list
        manager.addEmp(ptEmp);

        // Prints the information of the employees in the list
        manager.retrieveEmp();
        System.out.println();

        // Removes ptEmp from the list of employees
        manager.removeEmp(ptEmp);
        // Reprints the list of employees to show 'ptEmp' has been removed
        manager.retrieveEmp();



    }
}
