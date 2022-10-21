package lab1;

import java.util.Scanner;

public class Harmonic {
    public static String harmonic(int n){
        double sum = 0;
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i; j++){
                sum += (1.0 / j);
            }
            System.out.println(i + " " + sum);
            sum = 0;
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String harmonic = harmonic(n);
    }
}
