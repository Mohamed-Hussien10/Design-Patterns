import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapter implements Target{
    private ThirdPartyBillingSystem thirdPartyBillingSystem = new ThirdPartyBillingSystem();

    @Override
    public void processCompanySalary(String[][] employeeArray) {
        Employee newEmployee = null;
        List<Employee> employeesList = new ArrayList<>();
        for (String [] element : employeeArray) {
            newEmployee = new Employee(element[0], Integer.parseInt(element[1]), element[2]);
            employeesList.add(newEmployee);
        }
        System.out.println("Adapter converted Array of String to list of Employee");
        thirdPartyBillingSystem.processSaraly(employeesList);
    }
    
}
