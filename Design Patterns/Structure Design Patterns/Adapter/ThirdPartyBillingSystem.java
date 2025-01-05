import java.util.List;

public class ThirdPartyBillingSystem {
    public void processSaraly(List<Employee> listEmployee){
        for (Employee employee : listEmployee) {
            System.out.println("Name: " + employee.name + "\n" + "Salary: " + employee.salary+" EG");
            
        }
    }
}
