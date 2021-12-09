import java.util.Scanner;
import java.lang.Math; 
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        if(n%2==0){
            System.out.print(2+" ");
            while(n%2==0) n/=2;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0) System.out.print(i+" ");
            while(n%i==0) n/=i;
        }
        if(n>1) System.out.print(n);
    }
}
