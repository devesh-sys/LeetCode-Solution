class Solution {
    public int longestMonotonicSubarray(int[] nums) {
       int ilen=1;
       int dlen=1;
       int maxlen=1;
       for(int i=0;i<nums.length-1;i++){
        if(nums[i+1]>nums[i]){
            ilen++;
            dlen=1;
        }else if(nums[i+1]<nums[i]){
            dlen++;
            ilen=1;
        }else{
            ilen=1;
            dlen=1;
        }
        maxlen=Math.max(maxlen,Math.max(ilen,dlen));
       }
       return maxlen;
    }
}