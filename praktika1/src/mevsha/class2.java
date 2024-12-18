package mevsha;
import java.util.Scanner;

public class class2 {
    public static void main(String[] args){
        System.out.println("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Введите массив: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int j = 0;
        while(j<n){
            sum += arr[j];
            j++;
        }
        System.out.println("Сумма элементов массива равна " + sum);
        int min = 1000000;
        int max = -100000;
        for(int i = 0; i < n; i++){
            if(arr[i] <= min){
                min = arr[i];
            }
        }
        System.out.println("Наименьший элемент массива равен " + min);
        for(int i = 0; i < n; i++){
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        System.out.println("Наибольший элемент массива равен " + max);
    }
}
