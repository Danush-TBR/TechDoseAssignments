import java.util.Scanner;

public class QuickSelect {
    public static int findKthLargest(int[] arr, int k,int start,int end){
            int pivotIndex=Partiton(arr, start, end);
            System.out.println(pivotIndex+" "+(k-1));
            if(pivotIndex==k-1) return arr[pivotIndex];
            else if(pivotIndex<k-1) return findKthLargest(arr, k, pivotIndex+1, end);
            else return findKthLargest(arr, k, start, pivotIndex-1);
    }
    public static int Partiton(int[] arr,int start,int end){
        int pivotIndex=start,pivot=arr[end];
        for(int i=start;i<end;i++){
            if(arr[i]>=pivot){
                int temp=arr[pivotIndex];
                arr[pivotIndex]=arr[i];
                arr[i]=temp;
                pivotIndex++;
            }
        }
        int temp=arr[end];
        arr[end]=arr[pivotIndex];
        arr[pivotIndex]=temp;
        return pivotIndex;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt(),k; int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=scanner.nextInt();
        k=scanner.nextInt();
        System.out.print(findKthLargest(arr,k,0,n-1));
        scanner.close();
    }
}
