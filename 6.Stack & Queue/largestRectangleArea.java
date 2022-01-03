class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> myStack = new Stack<Integer>();
        int len=heights.length,maxArea=0,right,currArea; int[] left=new int[len];
        for(int i=0;i<len;i++){
            if(myStack.empty()) left[i]=0;
            else{
                while(!myStack.empty() && heights[myStack.peek()]>=heights[i]) myStack.pop();
                left[i]=myStack.empty()?0:myStack.peek()+1;
            }
            myStack.push(i);
        }
        myStack.clear();
        for(int i=len-1;i>=0;i--){
            if(myStack.empty()) right=len-1;
            else{
                while(!myStack.empty() && heights[myStack.peek()]>=heights[i]) myStack.pop();
                right=myStack.empty()?len-1:myStack.peek()-1;
            }
            myStack.push(i);
            currArea=(right-left[i]+1)*heights[i];
            if(maxArea<currArea) maxArea=currArea;
        }
        return maxArea;
    }
}
