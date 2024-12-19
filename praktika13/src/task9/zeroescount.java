package task9;

import java.util.Scanner;

public class zeroescount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a (количество нулей): ");
        int a = scanner.nextInt();
        System.out.print("Введите b (количество единиц): ");
        int b = scanner.nextInt();

        if (a > b + 1) {
            System.out.println(0);
        } else {
            System.out.println(countSequences(a, b));
        }
    }

    public static int countSequences(int a, int b) {
        if (a == 0) return 1;
        if (b == 0) return 1;
        if (a == 1) return b + 1;
        if (b == 1) return 1;

        return countSequences(a - 1, b - 1) + countSequences(a, b - 1);
    }
}