package task7;

import java.util.Scanner;

public class primefactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n (> 1): ");
        int n = scanner.nextInt();

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 1) {
            System.out.print(n);
        }
    }
}