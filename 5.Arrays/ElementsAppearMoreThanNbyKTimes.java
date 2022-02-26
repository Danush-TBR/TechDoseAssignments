import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums,int k) {
        int len=nums.length; int K=len/k;
        Map<Integer,Integer> myMap = new LinkedHashMap<Integer,Integer>();
        List myList = new ArrayList<Integer>();
        for(int i:nums){
            myMap.putIfAbsent(i,0);
            myMap.put(i,myMap.get(i)+1);
        }
        for(Map.Entry<Integer,Integer> entry: myMap.entrySet()){
            if(entry.getValue()>K){
                myList.add(entry.getKey());
            }
        }
        return myList;
    }
}
