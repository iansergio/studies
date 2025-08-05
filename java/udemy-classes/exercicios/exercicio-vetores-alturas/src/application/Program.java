package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        // Iniciando o vetor de tamanho n com os objetos pessoas
        Person[] vect = new Person[n];

        // For para ler os dados de cada pessoa
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: %n", i+1);

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();

            System.out.print("Atura: ");
            double height = sc.nextDouble();
            vect[i] = new Person(name, age, height);
        }
        System.out.println();
        // Calculando a media
        double sum = 0.0;
        double c = 0;
        for (int i = 0; i < vect.length; i++) {
            sum = sum + vect[i].getHeight();

            // Guardando quantas pessoas sao menores de 16 anos
            if (vect[i].getAge() < 16) {
                c += 1;
            }
        }
        // Calculando a media
        double med = sum / vect.length;
        System.out.printf("Altura media: %.2f %n", med);

        // Calculando a porcentagem de menores de 16 anos
        double percentage = (c * 100.0) / vect.length;
        System.out.println("Pessoas com menos de 16 anos: " + percentage + "%") ;

        // Imprimindo os nomes dos menores de 16 anos
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
