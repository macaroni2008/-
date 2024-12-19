package task2;

import java.util.Scanner;

public class testgenericstack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        testgenericstack<String> stack = new testgenericstack<>();

        System.out.println("Введите пять строк:");

        for (int i = 0; i < 5; i++) {
            stack.push(scanner.nextLine());
        }

        System.out.println("Строки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}