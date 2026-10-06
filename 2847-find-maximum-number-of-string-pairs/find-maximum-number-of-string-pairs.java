class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
       Set<String> set=new HashSet<>();
       int count=0;
       for(String str:words){
        if(set.contains(str)){
            count++;
        }
        String rev=new StringBuilder(str).reverse().toString();
        set.add(rev);
       }
       return count;
    }
}