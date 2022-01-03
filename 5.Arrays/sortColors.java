class Solution {
    public void sortColors(int[] arr) {
        int low=0,median=0,high=arr.length-1,temp;
        while(median<=high){
            if(arr[median]==0){
                temp=arr[median];
                arr[median]=arr[low];
                arr[low]=temp;
                low++; median++;                
            }
            else if(arr[median]==1) median++;
            else if(arr[median]==2){
                temp=arr[median];
                arr[median]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
}
