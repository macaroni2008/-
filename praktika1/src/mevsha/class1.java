package mevsha;
import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Введите массив: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        System.out.println("Сумма элементов массива равна " + sum);
        double avg;
        avg = (double) sum/n;
        System.out.println("Среднее арефметическое элементов мссива равно " + avg);
    }
}
