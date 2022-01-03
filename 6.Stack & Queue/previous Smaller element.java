import java.util.*;
public class previousSmallElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt(); int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=scanner.nextInt();
        Stack<Integer> myStack = new Stack<Integer>();
        for(int i=n-1;i>=0;i--){
            if(myStack.empty()) myStack.push(i);
            else if(arr[myStack.peek()]<=arr[i]) myStack.push(i);
            else{
                while(!myStack.empty() && arr[myStack.peek()]>arr[i]){
                    arr[myStack.pop()]=arr[i];
                }
                myStack.push(i);
            }
        }
        while(!myStack.empty()) arr[myStack.pop()]=-1;
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
        scanner.close();
    }
}
