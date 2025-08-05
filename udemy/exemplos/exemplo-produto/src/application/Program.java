package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        // Imprimindo os valores
        System.out.println();
        System.out.println("Product data: " + product);

        // Inserindo produtos no estoque
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product);

        // Retirando produtos do estoque
        System.out.println();
        System.out.print("Enter the number of products to be rmeoved from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        // Imprimindo os valores
        System.out.println();
        System.out.println("Updated data: " + product);


        sc.close();
    }
}
