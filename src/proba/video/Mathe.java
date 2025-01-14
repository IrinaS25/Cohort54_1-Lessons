package proba.video;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mathe {
    public static void main(String[] args) {

        final int STUDENT = 6;
        int[] grades = new int[STUDENT];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Schreiben Sie noten " + STUDENT + " Studenten (von 2 bis 5)");
        for (int i = 0; i < STUDENT; i++) {
            while (true) {

                System.out.println("Note von Student " + (i + 1) + ": ");
                int grade = scanner.nextInt();

                if (grade >= 2 && grade <= 5) {
                    grades[i] = grade;
                    break;
                } else {
                    System.out.println("Sie haben falsche Note eingegeben. Schreiben Sie die Note von 2 bis 5");
                }
            }
        }
        int failing = 0;
        int average = 0;
        int good = 0;
        int excellent = 0;

        for (int grade : grades) {
            switch (grade) {
                case 2:
                    failing++;
                    break;
                case 3:
                    average++;
                    break;
                case 4:
                    good++;
                    break;
                case 5:
                    excellent++;
                    break;
            }
        }
        String most = "Falling";
        int maxCounter = failing;
        if (average > maxCounter) {
            most = "Average";
            maxCounter = average;
        }
        if (good > maxCounter) {
            most = "Good";
            maxCounter = good;
        }
        if (excellent > maxCounter) {
            most = "Excellent";
            maxCounter = excellent;
        }
        System.out.println("\nErgebnisse:");
        System.out.println("Falling: " + failing);
        System.out.println("Average: " + average);
        System.out.println("Good: " + good);
        System.out.println("Excellent: " + excellent);
        System.out.println("Mehr: " + most + " (" +maxCounter + ")");
    }
}

















