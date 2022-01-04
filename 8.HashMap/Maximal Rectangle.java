class Solution {
    int r,c;
    public int findMaxArea(int[] arr){
        int[] left = new int[c]; int right;
        int currMaxArea=0,MaxArea=0;
        Stack<Integer> myStack = new Stack<Integer>();
        for(int i=0;i<c;i++){
            while(!myStack.empty() && arr[myStack.peek()]>=arr[i]) myStack.pop();
            if(myStack.empty()) left[i]=0;
            else left[i]=myStack.peek()+1;
            myStack.push(i);
        }
        myStack.clear();
        for(int i=c-1;i>=0;i--){
            while(!myStack.empty() && arr[myStack.peek()]>=arr[i]) myStack.pop();
            if(myStack.empty()) right=c-1;
            else right=myStack.peek()-1;
            myStack.push(i);
            currMaxArea = (right-left[i]+1)*arr[i];
            if(MaxArea<currMaxArea) MaxArea=currMaxArea;
        }
        return MaxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int i,j,MaxArea=0,currMaxArea=0; r=matrix.length; c=matrix[0].length;
        int[] currRow=new int[c];
        for(j=0;j<c;j++) currRow[j]=matrix[0][j]-'0';
        MaxArea = findMaxArea(currRow);
        for(i=1;i<r;i++){
            for(j=0;j<c;j++) currRow[j]= matrix[i][j]=='0'? 0 :currRow[j]+1;
            currMaxArea = findMaxArea(currRow);
            if(currMaxArea>MaxArea) MaxArea=currMaxArea;
        }
        return MaxArea;
    }
}
