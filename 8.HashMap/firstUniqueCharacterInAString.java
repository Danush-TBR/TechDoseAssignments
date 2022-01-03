class Solution {
    public int firstUniqChar(String s) {
       int[] freq = new int[26]; int len=s.length();
        for(int i=0;i<len;i++) freq[s.charAt(i)-97]++;
        for(int i=0;i<len;i++) if(freq[s.charAt(i)-97]==1) return i;
        return -1;
    }
}
