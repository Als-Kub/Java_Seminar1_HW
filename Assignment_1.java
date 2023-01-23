/*
Задание 1.
Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n
 */
package Homework;

import java.util.Scanner;

public class Assignment_1 {
    static int sum(int num) {
        int s = 0;
        for (int i = 0; i <= num; i++) {
            s += i;
        }
        return s;
    }

    static int factor(int num) {
        if (num == 1)
            return 1;
        int fact = num * factor(num - 1);
        return fact;
    }

    public static void main(String[] args) {
        System.out.printf("Please, enter an integer:");
        Scanner sc = new Scanner(System.in);
        String num_i = sc.nextLine();
        sc.close();
        try {
            int num = Integer.parseInt(num_i.trim());
            System.out.println("Sum = " + sum(num));
            System.out.println("Factorial = " + factor(num));
        } catch (NumberFormatException nfe) {
            System.out.println("It's not a number. Try again, please. " +
                    nfe.getMessage());
        }
    }

}
