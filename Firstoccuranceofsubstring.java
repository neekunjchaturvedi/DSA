class Solution {
    public int strStr(String haystack, String needle) {
        int hlen=haystack.length();
        int nlen=needle.length();
        if (nlen == 0) return 0;
        if (nlen > hlen) return -1;
        
        for(int i=0;i<=hlen-nlen;i++){
            if(haystack.substring(i,i+nlen).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}