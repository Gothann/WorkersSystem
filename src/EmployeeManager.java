import java.util.*;

public class EmployeeManager {

    private final HashMap<Integer,Employee> employees;

    public EmployeeManager(HashMap<Integer, Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(String firstName, String lastName, String position, int salary) {
        Employee employee = new Employee(firstName, lastName, position, salary);
        Integer keyEmployee = employee.getEmployeeID();
        this.employees.put(keyEmployee, employee);
    }

    public void removeEmployee(Employee employee) {
        if (this.employees.containsKey(employee.getEmployeeID())) {
            this.employees.remove(employee.getEmployeeID());
        } else {
            System.out.println("Pracownik o takim ID nie istnieje");
        }

    }

    public void updateEmployee(int employeeID, Employee newEmployee){
        if(employees.containsKey(employeeID))
        {
            employees.put(employeeID,newEmployee);
        }
        else
            System.out.println("Pracownik o takim ID nie istnieje");
    }
    public Employee searchEmployeeByID(int employeeID) {
        if(employees.containsKey(employeeID)){
            return employees.get(employeeID);
        }
        else
            System.out.println("Nie znaleziono pracownika o danym ID");
           return null;
    }
    public void listAllEmployees(){
        ArrayList<Employee> employeeList = new ArrayList<>(employees.values());
        for (Employee employee: employeeList
             ) {
            System.out.println(employee);
        }
    }
    public HashSet<Employee> searchEmployeesByPosition(String position){
         HashSet<Employee> employeeList = new HashSet<>(employees.values());
        Iterator<Employee> employeeIterator = employeeList.iterator();
        while(employeeIterator.hasNext())
        {
            Employee employee = employeeIterator.next();
            if(!employee.getPosition().equals(position))
                employeeIterator.remove();
        }
        return employeeList;
    }


}
