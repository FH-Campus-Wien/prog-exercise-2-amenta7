package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        float largest_number = 0;

        for (int i = 1;; i++) {
            System.out.print("Number " + i + ": ");
            float number = scanner.nextFloat();

            if (i == 1 && number <= 0) {
                System.out.println("No number entered.");
                break;
            }
            if (i >= 1 && number > largest_number) {
                largest_number = number;
            } else if (i > 1 && number <= 0) {
                String result = String.format("The largest number is %,.2f", largest_number);
                System.out.println(result);
                break;
            }
        }
    }

    //todo Task 2
    public void stairs(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Invalid number!");
        } else {
            int counter = 1;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(counter + " ");
                    counter++;
                }
                System.out.println();
            }
        }
    }

    //todo Task 3
    public void printPyramid(){
        final int levels = 6;

        for (int row = 1; row <= levels; row++) {
            for (int column = levels; column > row; column--) {
                System.out.print(" ");
            }

            for (int column = 0; column < row * 2 - 1; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);

        if (h % 2 == 0) {
            System.out.println("Invalid number!");
        } else {
            for (int i = 0; i < h/2; i++) {

                for (int j = 0; j < h/2 - i; j++) {
                    System.out.print(" ");
                }

                for (int j = c - i; j <= c; j++) {
                    System.out.print((char)j);
                }

                for (int j = 0; j < i; j++) {
                    System.out.print((char)(c - j - 1));
                }
                System.out.println();
            }

            int spaces = 0;

            for (int i = h/2; i >= 0; i--) {

                for (int j = 0; j < spaces; j++){
                    System.out.print(" ");
                }

                for (int j = i; j >= 0; j--) {
                    System.out.print((char)(c - j));
                }

                for (int j = 1; j <= i; j++) {
                    System.out.print((char)(c - j));
                }
                System.out.println("");
                spaces++;
            }
        }
    }

    //todo Task 5
    public void marks() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int negative = 0;

        for (int i = 1;; i++) {
            System.out.print("Mark " + i + ": ");
            int mark = scanner.nextInt();

            if (mark < 5 && mark > 0) {
                sum += mark;
            } else if (mark > 5 || mark < 0) {
                System.out.println("Invalid mark!");
                i--;
            } else if (mark == 5) {
                negative++;
                sum += mark;
            } else if (mark == 0 && i > 1) {
                float average = (float) sum / (i - 1);
                String result = String.format("Average: %.2f", average);
                System.out.println(result);
                System.out.println("Negative marks: " + negative);
                break;
            } else if (mark == 0 && i == 1) {
                float average = (float) sum / i;
                String result = String.format("Average: %.2f", average);
                System.out.println(result);
                System.out.println("Negative marks: " + negative);
                break;
            }
        }
    }

    //todo Task 6
    public void happyNumbers() {
        Scanner scanner = new Scanner(System.in);
        int n, r = 1, num, sum = 0;

        System.out.print("n: ");
        n = scanner.nextInt();
        num = n;

        while (num > 9) {
            while (num > 0) {
                r = num % 10;
                sum = sum + (r * r);
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }

        if (num == 1) {
            System.out.println("Happy number!");
        } else {
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fr??hliche Zahlen");
        exercise2.happyNumbers();
    }
}