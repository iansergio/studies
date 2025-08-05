package application;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1));

            System.out.print("Id: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();
        int pos = findIdPosition(list, idSalary);

        if (pos == -1) {
            System.out.println("This id does not exist! ");
        } else {
            System.out.print("Enter the percentage ");
            double percent = sc.nextDouble();
            list.get(pos).inscreaseSalary(percent);
        }

        for (Employee emp : list) {
            System.out.println(emp);
        }

        sc.close();
    }

    public static int findIdPosition(List <Employee> list, int id ){

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
}
