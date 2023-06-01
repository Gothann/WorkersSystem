public class Employee {

    public static int nextId = 0;
    private String firstName;
    private String lastName;
    private String position;
    private int employeeID;
    private int salary;

    public Employee(String firstName, String lastName, String position, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.employeeID = nextId++;
        this.salary = salary;
    }

    public Employee() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }


}
