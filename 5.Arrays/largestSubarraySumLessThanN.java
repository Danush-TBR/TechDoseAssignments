import java.util.*;
public class largestSubarraySumLessThanN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt(),max_len=0;
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scanner.nextInt();
        }
        int K=scanner.nextInt();
        int l=0,r=0,currSum=0;
        while(r<N){
            // System.out.println(l+" "+r);
            if(currSum<K){
                currSum+=arr[r];
                if(currSum<=K){
                    // System.out.println(l+" "+r+" "+currSum);
                    max_len=Math.max(r-l+1,max_len);
                }
                r++;
            }
            else if(arr[r]>K){
                l=r+1;
                r=r+1;
                currSum=0;
            }
            else{
                currSum-=arr[l];
                l++;
                if(l==r){
                    l++; r++;
                }
            }
        }
        System.out.println(max_len);
        scanner.close();
    }
}
