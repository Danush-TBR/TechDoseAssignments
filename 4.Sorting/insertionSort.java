import java.util.*;
public class insertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt(); int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i]=scanner.nextInt();
		for(int i=0;i<n;i++){
		    int j=i-1,key=arr[i];
		    while(j>=0 && arr[j]>key) arr[j+1]=arr[j--];
		    arr[j+1]=key;
		}
        for(int j=0;j<n;j++) System.out.print(arr[j]+" ");
        scanner.close();
	}
}
