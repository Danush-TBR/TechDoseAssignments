import java.util.Scanner;
public class bubbleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt(); int[] arr=new int[n]; boolean isSwapped;
		for(int i=0;i<n;i++) arr[i]=scanner.nextInt();
		for(int i=0;i<n-1;i++){
			isSwapped=false;
		    for(int j=0;j<n-i-1;j++){
		        if(arr[j]>arr[j+1]){
		            arr[j]^=arr[j+1];
		            arr[j+1]^=arr[j];
		            arr[j]^=arr[j+1];
					isSwapped=true;
		        }   
		    }
			if(isSwapped==false) break;
		}
		for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
		scanner.close();
	}
}
