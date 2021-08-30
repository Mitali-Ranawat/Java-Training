class Employee {
    private String name;
    private String email;
    private String gender;
    private int salary;

    Employee(String name, String email, String gender, int salary) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    

    public int getSalary() {
        return this.salary;
    }

    public void addSalary(int amount) {
        this.salary += amount;
    }
}


public class question2 {
    public static void main(String args[]) {
        Employee newEmployee = new Employee("Mitali", "mitali@gmail.com", "F", 500000);

        System.out.println("Name: " +newEmployee.getName());
        System.out.println("Email: " +newEmployee.getEmail());
        System.out.println("Gender: " +newEmployee.getGender());
        System.out.println("Salary: " +newEmployee.getSalary());

        System.out.println("");
        System.out.println("Updated values");

        newEmployee.setName("Mitali Ranawat");
        System.out.println("Name updated as: " +newEmployee.getName());

        newEmployee.addSalary(100000);
        System.out.println("Updated Salary: " +newEmployee.getSalary());

        
    }
}