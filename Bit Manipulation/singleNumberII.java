class Solution {
    public int singleNumber(int[] nums) {
        int ones=0,twos=0,len=nums.length;
        for(int i=0;i<len;i++){
            ones=(ones^nums[i])&(~twos);
            twos=(twos^nums[i])&(~ones);
        }
        return ones;
    }
}
