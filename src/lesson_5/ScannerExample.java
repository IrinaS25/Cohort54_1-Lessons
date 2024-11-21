package lesson_5;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mach bitte Name:");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("Mach aus dein Jahr");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println(age + 1);

        System.out.println("Mach aus wie viel Kinder:");
        int children = scanner.nextInt();
        scanner.nextLine();
        System.out.println(children);

        System.out.println("++++++++++++++++++++++");

        System.out.println("Mach double: ");
        double dobleVar = scanner.nextDouble();
        System.out.println(dobleVar);


    }
}
