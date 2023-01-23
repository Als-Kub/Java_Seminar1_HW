/*
Задание 2.
Вывести все простые числа от 1 до 1000
 */
package Homework;

public class Assignment_2 {
    public static void main(String[] args) {

        int n = 1000;
        for (int i = 2; i < n; i++) {
            boolean simple = true;
            int r = (int) Math.sqrt(i);
            for (int j = 2; j <= r; j++) {
                if ((i % j) == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                System.out.print(i + " ");
            }
        }
    }
}
