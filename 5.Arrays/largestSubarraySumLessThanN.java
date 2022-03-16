import java.util.*;
public class largestSubarraySumLessThanN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt(),max_len=0;
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scanner.nextInt();
        }
        scanner.close();
    }
}
