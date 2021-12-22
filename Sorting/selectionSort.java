import java.util.*;
public class selectionSort {

    public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int n = scanner.nextInt(),minIndex; int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i]=scanner.nextInt();
		for(int i=0;i<n-1;i++){
		    minIndex=i;
		    for(int j=i+1;j<n;j++) if(arr[j]<arr[minIndex]) minIndex=j;
		    if(minIndex!=i){
		        arr[minIndex]^=arr[i];
		        arr[i]^=arr[minIndex];
		        arr[minIndex]^=arr[i];
		    }
		}
        for(int j=0;j<n;j++) System.out.print(arr[j]+" ");
        scanner.close();
	}
}
