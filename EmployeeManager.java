import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    // Create
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Read
    public void showAllEmployeesInfo() {
        for (Employee employee : employees) {
            employee.showInfo();
            System.out.println();
        }
    }

    // Update
    public void updateEmployee(String id, Employee updatedEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).id.equals(id)) {
                employees.set(i, updatedEmployee);
                break;
            }
        }
    }

    // Delete
    public void deleteEmployee(String id) {
        employees.removeIf(employee -> employee.id.equals(id));
    }
}