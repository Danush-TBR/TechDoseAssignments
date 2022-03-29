class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,len=s.length(),max=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<len){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            if(map.get(s.charAt(j))>1){
                max=Math.max(max,j-i);
                while(s.charAt(i)!=s.charAt(j)){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    i++;
                }
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
            j++;
        }
        max=Math.max(max,j-i);
        return max;
    }
}
