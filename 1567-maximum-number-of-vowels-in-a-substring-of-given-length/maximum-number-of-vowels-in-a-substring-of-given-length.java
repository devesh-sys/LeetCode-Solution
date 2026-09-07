class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels=new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int maxv=0;
        int currentv=0;
        for(int i=0;i<k;i++){
            if(vowels.contains(s.charAt(i))){
                currentv++;
            }
        }
         maxv=currentv;
         for(int i=k;i<s.length();i++){
            if(vowels.contains(s.charAt(i-k))){
                currentv--;
            }
            if(vowels.contains(s.charAt(i))){
                currentv++;
            }
            maxv=Math.max(maxv,currentv);
         }
         return maxv;
    }
}