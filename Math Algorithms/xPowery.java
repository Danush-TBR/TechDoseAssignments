import java.util.Scanner;

public class xPowery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt(),y=scanner.nextInt();
        long res=1;
        while(y>0){
            if(y%2==1) res*=x;
            x*=x;
            y>>=1;
        }
        System.out.print(res);
    }
}
