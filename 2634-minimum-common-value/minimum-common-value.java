class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       Set<Integer> set=new HashSet<>();
       for(int i:nums1){
        set.add(i);
       } 
       int mini=Integer.MAX_VALUE;
       for(int j:nums2){
        if(set.contains(j)){
            mini=Math.min(mini,j);
        }
       }
       if(mini!=Integer.MAX_VALUE){
        return mini;
       }
       return -1;
    }
}