package assignment01.employee;

public class Employee {
	
	long employeeId;
	String employeeName;
	String employeeAddress;
	String employee;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double HRA = 1000.50;




    public Employee(long id, String name, String address, long phone, double salary) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeAddress = address;
        this.employeePhone = phone;
        this.basicSalary = salary;
        System.out.println("Employee Constructor Called for ID: " + id); // Added for tracking
    }

    // --- Getters ---
    public long getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public long getEmployeePhone() {
        return employeePhone;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    /**
     * Calculates the salary for a regular employee.
     * Can be overridden by subclasses for specific calculations.
     * @return The calculated salary (just basic salary for a generic employee).
     */
    public double calculateSalary() {
        return this.basicSalary;
    }

    /**
     * Displays Employee details.
     */
     public void displayDetails() {
        System.out.println("--------------------------");
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Employee Name: " + getEmployeeName());
        System.out.println("Address: " + getEmployeeAddress());
        System.out.println("Phone: " + getEmployeePhone());
        System.out.println("Basic Salary: " + getBasicSalary());
     }
}