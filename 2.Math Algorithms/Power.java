import java.util.Scanner;
public class Power
{
    static int power(int x, int y)
    {
        int res = 1;
        while (y > 0)
        {
            if (y & 1) res = res * x;
            y = y/2;
            x = x*x;
        }
        return res;
    }

public static void main (String[] args)
{
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
 
    System.out.println("Power is " +power(x, y));
}
}
