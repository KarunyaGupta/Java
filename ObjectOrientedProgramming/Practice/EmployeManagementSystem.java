class EmployeManagementSystem {
    private String name;
    private int id;
    private double salary;
    private static String companyName = "ABC Corp"; // Static variable

    // Constructors (Constructor Overloading)
    public EmployeManagementSystem(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public EmployeManagementSystem(String name, int id) {
        this(name, id, 0.0); // Calls the other constructor to set salary to 0
    }

    public EmployeManagementSystem(int id) {
        this("Unknown", id, 0.0); // Calls the other constructor with default name and 0 salary
    }



    // Methods
    public double calculateBonus() {
        // Simple bonus calculation (can be customized)
        return salary * 0.10; // 10% bonus
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);  // Accessing static variable
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("--------------------");
    }

    // Getters and Setters (Optional, but good practice)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        EmployeManagementSystem.companyName = companyName;
    }


    public static void main(String[] args) {
        // Creating Employee objects using different constructors
        EmployeManagementSystem emp1 = new EmployeManagementSystem("Alice", 101, 50000);
        EmployeManagementSystem emp2 = new EmployeManagementSystem("Bob", 102); // Salary defaults to 0
        EmployeManagementSystem emp3 = new EmployeManagementSystem(103);      // Name defaults to "Unknown", salary to 0

        // Displaying details
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();

        //Demonstrating static variable
        System.out.println("Company Name (Directly): " + EmployeManagementSystem.companyName); // Accessing directly
        EmployeManagementSystem.setCompanyName("NewCorp"); // Changing Company Name
        System.out.println("Company Name (After change): " + EmployeManagementSystem.companyName); // Accessing directly

        emp1.displayDetails(); // Company name is updated for all objects

    }
}