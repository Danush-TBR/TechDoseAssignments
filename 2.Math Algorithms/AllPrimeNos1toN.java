import java.util.Scanner;
public class AllPrimeNos1toN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        boolean[] primes = new boolean[n];
        for(int i=2;i<=n;i++){
            if(primes[i-1]==false){
                for(int j=2;j*i<=n;j++) primes[(i*j)-1]=true;
            }
        }
        for(int i=1;i<n;i++){
            if(primes[i]==false) System.out.print(i+1+" ");
        }
        scanner.close();
    }
}
