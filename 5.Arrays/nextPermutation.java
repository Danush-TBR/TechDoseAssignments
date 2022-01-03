class Solution {
    public void nextPermutation(int[] nums) {
        int len=nums.length; int i=len-1;
        while(i>0 && nums[i-1]>=nums[i]) i--;
        if(i==0) reverse(nums,0,len-1);
        else{
            int j=len-1;
            while(j>=0 && nums[i-1]>=nums[j]) j--;
            swap(nums,i-1,j);
            reverse(nums,i,len-1);
        }
    }
    public void reverse(int[] arr,int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++; end--;
        }
    }
    public void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
