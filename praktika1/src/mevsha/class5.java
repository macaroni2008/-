package mevsha;
import java.util.Scanner;

public class class5 {
    public static int calculatef (int a){
        int b = 1;
        for(int i = 1; i <= a; i++){
            b *= i;
        }
        return b;
    }
    public static void main(String[] args){
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = calculatef(n);
        System.out.println("Факториал числа " + n + " равен " + f);
    }
}
