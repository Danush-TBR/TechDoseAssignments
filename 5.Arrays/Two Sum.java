class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
        int len=nums.length; int[] result = new int[2];
        for(int i=0;i<len;i++){
            if(myMap.containsKey(target-nums[i])){
                result[0]=myMap.get(target-nums[i]);
                result[1]=i;
                break;
            }
            myMap.put(nums[i],i);
        }
        return result;
    }
}
