package java_Learning;

public class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void show() {
        System.out.println("Id: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(4287, "Lokesh", 60000);
        Employee e2 = new Employee(4288, "Lucky", 70000);
        Employee e3 = new Employee(4289, "LLL", 90000);

        e1.show();
        e2.show();
        e3.show();
    }
}


