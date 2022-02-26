import java.util.Scanner;

public class SortWaveForm {
    public static void swap(int[] arr, int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=scanner.nextInt();
        for(int i=0;i<n;i+=2){
            if(i>0 && arr[i]<arr[i-1]){
                swap(arr,i,i-1);
            }
            else if(i<n-1 && arr[i]<arr[i+1]){
                swap(arr, i, i+1);
            }
        }
        for(int i:arr) System.out.print(i+" ");
        scanner.close();
    }
}
