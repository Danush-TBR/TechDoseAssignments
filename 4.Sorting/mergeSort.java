import java.util.Scanner;

public class mergeSort {
    public static void merge(int[] arr,int start,int mid,int end){
        int[] temp=new int[end-start+1]; int i=start,j=mid+1,k=0;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]) temp[k++]=arr[i++];
            else temp[k++]=arr[j++];
        }
        while(i<=mid) temp[k++]=arr[i++];
        while(j<=end) temp[k++]=arr[j++];
        for(i=start;i<=end;i++) arr[i]=temp[i-start];
        
    }
    public static void mergesort(int[] arr,int start,int end){
        if(start>=end) return;
        int mid=(start+end)/2;
        mergesort(arr, start, mid);
        mergesort(arr, mid+1 , end);
        merge(arr, start, mid, end);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt(); int[] arr= new int[n];
        for(int i=0;i<n;i++) arr[i]=scanner.nextInt();
        mergesort(arr,0,n-1);
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
        scanner.close();
    }
}
