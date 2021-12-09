import java.util.Scanner;
import java.lang.Math;
import java.lang.System;
public class PrimeNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n==2){
            System.out.println("Prime Number");
            System.exit(0);
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("Not a Prime Number");
                System.exit(0);
            }
        }
        System.out.println(("Prime Number"));
    }
}
