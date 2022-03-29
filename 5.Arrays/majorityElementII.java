class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len=nums.length,a=0,b=0,cnt1=0,cnt2=0; int K=len/3;
        // if(len==0) new ArrayList<Integer>();
        List myList = new ArrayList<Integer>();
        for(int i:nums){
            if(a==i) cnt1++;
            else if(b==i) cnt2++;
            else if(cnt1==0){
                a=i; cnt1=1;
            }
            else if(cnt2==0){
                b=i; cnt2=1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0; cnt2=0;
        for(int i:nums){
            if(i==a) cnt1++;
            else if(i==b) cnt2++;
        }
        if(cnt1>K) myList.add(a);
        if(cnt2>K) myList.add(b);
        return myList;
        // Map<Integer,Integer> myMap = new LinkedHashMap<Integer,Integer>();
        // List myList = new ArrayList<Integer>();
        // for(int i:nums){
        //     myMap.putIfAbsent(i,0);
        //     myMap.put(i,myMap.get(i)+1);
        // }
        // for(Map.Entry<Integer,Integer> entry: myMap.entrySet()){
        //     if(entry.getValue()>K){
        //         myList.add(entry.getKey());
        //     }
        // }
        // return myList;
    }
}
