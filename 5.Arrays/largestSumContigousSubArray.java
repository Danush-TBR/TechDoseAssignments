import java.util.Scanner;

public class largestSumContigousSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt(); int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=scanner.nextInt();
        int max=Integer.MIN_VALUE,curr_max=0;
        for(int i=0;i<n;i++){
            curr_max+=arr[i];
            if(curr_max<arr[i]) curr_max=arr[i];
            if(curr_max>max) max=curr_max;
        }
        System.out.print(max);
        scanner.close();
    }
}
