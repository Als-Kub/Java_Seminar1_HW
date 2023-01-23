/*
Задание 3.
Реализовать простой калькулятор (операции + - / * )
Пример работы программы:

Введите число 1: 2
Введите число 2: 3
Введите операцию: +
Ответ: 5
Введите число 1: 2
Введите число 2: 3
Введите операцию: а
Ответ: Такой операции нет
 */

package Homework;

import java.text.ParsePosition;
import java.util.Scanner;

public class Assignment_3 {
    static float sum(float num_1, float num_2) {
        float sum = num_1 + num_2;
        return sum;
    }

    static float sub(float num_1, float num_2) {
        float sub = num_1 - num_2;
        return sub;
    }

    static float mult(float num_1, float num_2) {
        float mult = num_1 * num_2;
        return mult;
    }

    static float div(float num_1, float num_2) {
        float div = num_1 / num_2;
        return div;
    }

    static String wr() {

        return "wrong number";
    }

    public static void main(String[] args) {
        System.out.printf("Enter the first number:");
        Scanner sc = new Scanner(System.in);
        float num_1 = sc.nextInt();
        System.out.printf("Enter the second number:");
        sc = new Scanner(System.in);
        float num_2 = sc.nextFloat();
        System.out.printf("Select an operation: '+', '-', '*', '/' ");
        sc = new Scanner(System.in);

        String oper = sc.nextLine();
        String result;
        switch (oper) {
            case "+":
                result = Float.toString(sum(num_1, num_2));
                break;
            case "-":
                result = Float.toString(sub(num_1, num_2));
                break;
            case "*":
                result = Float.toString(mult(num_1, num_2));
                break;
            case "/":
                result = Float.toString(div(num_1, num_2));
                break;
            default:
                result = "No such operation! Try again, please.";
                break;
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}
