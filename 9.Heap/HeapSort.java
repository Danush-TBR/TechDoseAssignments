import java.util.*;
public class HeapSort {
    public static void buildHeap(int[] arr,int N){
        for(int i=N/2;i>=1;i--){
            maxHeapify(arr,i,N);
        }
    }
// 5
// 0 4 5 9 8 6
// [0, 4, 5, 9, 8, 6]
// [0, 9, 5, 4, 8, 6]
// [0, 9, 5, 4, 8, 6]
// 9
// 6
// 8
// 4
// 5
    public static void maxHeapify(int[] arr,int index,int N){
        int L=2*index,R=(2*index)+1;
        int largest=index;
        if(L<=N && arr[L]>arr[index]){
            largest = L;
        }
        if(R<=N && arr[R]>arr[largest]){
            largest = R;
        }
        if(largest!=index){
            int temp=arr[index];
            arr[index]=arr[largest];
            arr[largest]=temp;
            maxHeapify(arr, largest, N);
        }
    }
    public static int heapPop(int[] arr,int N){
        int max = arr[1];
        arr[1] = arr[N];
        maxHeapify(arr, 1, N-1);
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int[] arr = new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i]=scanner.nextInt();
        }
        scanner.close();
        buildHeap(arr,N);
        System.out.println(Arrays.toString(arr));
        while(N>0){
            System.out.println(heapPop(arr,N));
            N--;
        }
    }
}