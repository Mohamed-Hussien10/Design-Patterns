public class Main {

    public static void main(String[] args) {
        String[][] employee = {
            {"John", "50000","1"},
            {"Jane", "40000","2"},
            {"Bob", "60000","3"}
        };

        Target targets = new EmployeeAdapter();   

        targets.processCompanySalary(employee);
    }
}