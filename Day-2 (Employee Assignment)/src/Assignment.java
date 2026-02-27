import java.sql.Struct;

class Employee {
    int empid;
    int age;
    String name;
    String department;
    float salary;

    Employee(int empid, int age, String name, String department, float salary){
        this.empid = empid;
        this.age = age;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    String getName() {
        return this.name;
    }

    String getDepartment(){
        return this.department;
    }

    int getEmpId(){
        return this.empid;
    }

    int getAge(){
        return this.age;
    }

    float getSalary() {
        return this.salary;
    }

    void setAge(int age){
        this.age = age;
    }

    void setName(String name){
        this.name = name;
    }

    void setDepartment(String department){
        this.department = department;
    }

    void setSalary(float salary) {
        this.salary = salary;
    }

}

public class Assignment {
    public static void main(String[] args){
        Employee aadil = new Employee(1, 26, "Aadil Ansari", "Computer Department", 30000.0f);

        String name = aadil.getName();
        String department = aadil.getDepartment();
        int age = aadil.getAge();
        int id = aadil.getEmpId();
        float salary = aadil.getSalary();

        System.out.printf("Name: %s Department: %s Age: %d Emp Id: %d Salary: %.2f", name, department, age, id, salary);

        aadil.setName("Aadil");
        aadil.setAge(25);
        aadil.setDepartment("Computer Applications");
        aadil.setSalary(20000.0f);

         name = aadil.getName();
         department = aadil.getDepartment();
         age = aadil.getAge();
         salary = aadil.getSalary();

        System.out.printf("\nAfter using setters \nName: %s Department: %s Age: %d Emp Id: %d Salary: %.2f", name, department, age, id, salary);

    }
}
