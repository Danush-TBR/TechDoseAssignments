class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        char[] s; String temp;
        for(String str:strs){
            s=str.toCharArray();
            Arrays.sort(s);temp=new String(s);
            if(map.containsKey(temp)){
                map.get(temp).add(str);
            }
            else{
                map.put(temp,new ArrayList<>());
                map.get(temp).add(str);
            }
        }
        return new ArrayList<>(map.values());
    }
}
