class Solution {
    public int trap(int[] height) {
        int len=height.length;
        if(len<=2) return 0;
        int i=1,j=len-2,maxLeft=height[0],maxRight=height[len-1],sum=0;
        while(i<=j){
            if(maxLeft<maxRight){
                if(height[i]>=maxLeft) maxLeft=height[i];
                else sum+=maxLeft-height[i];
                i++;
            }
            else{
                if(height[j]>=maxRight) maxRight=height[j];
                else sum+=maxRight-height[j];
                j--;
            }
        }
        return sum;
    }
}
