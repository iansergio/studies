package entities;

public class Employee {
    private int id;
    private String name;
    private double salary;

    // Construtor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Metodo de aumento de salário
    public void inscreaseSalary(double percentage){
        salary += salary  * percentage / 100.0;
    }

    public String toString(){
        return id + "," + name + "," + salary;
    }
}
