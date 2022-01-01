import java.util.Scanner;

class Employee {
    String name;
    int age;
    long phno;
    String address;
    float salary;

    void PrintSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}

public class classInheritanceEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Officer o = new Officer();
        Manager m = new Manager();
        System.out.println("Enter the details of the officer:");
        System.out.print("Enter the name of the officer: ");
        o.name = sc.nextLine();
        System.out.print("Enter the age of the officer: ");
        o.age = sc.nextInt();
        System.out.print("Enter the phone number of the officer: ");
        o.phno = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the address of the officer: ");
        o.address = sc.nextLine();
        System.out.print("Enter the salary of the officer: ");
        o.salary = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter the specialization of the officer: ");
        o.specialization = sc.nextLine();

        System.out.println("\nThe details of the officer:");
        System.out.println("Name: " + o.name);
        System.out.println("Age: " + o.age);
        System.out.println("Phone number: " + o.phno);
        System.out.println("Address: " + o.address);
        o.PrintSalary();
        System.out.println("Specialization: " + o.specialization);

        System.out.println("\nEnter the details of the manager:");
        System.out.print("Enter the name of the manager: ");
        m.name = sc.nextLine();
        System.out.print("Enter the age of the manager: ");
        m.age = sc.nextInt();
        System.out.print("Enter the phone number of the manager: ");
        m.phno = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the address of the manager: ");
        m.address = sc.nextLine();
        System.out.print("Enter the salary of the manager: ");
        m.salary = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter the department of the manager: ");
        m.department = sc.nextLine();

        System.out.println("\nThe details of the manager:");
        System.out.println("Name: " + m.name);
        System.out.println("Age: " + m.age);
        System.out.println("Phone number: " + m.phno);
        System.out.println("Address: " + m.address);
        m.PrintSalary();
        System.out.println("Department: " + m.department);

        sc.close();
    }
}