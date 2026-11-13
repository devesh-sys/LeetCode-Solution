class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int maxlen=0;
        int count=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            freq[ch-'A']++;
            count=Math.max(count,freq[ch-'A']);
            if((right-left+1)-count>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}