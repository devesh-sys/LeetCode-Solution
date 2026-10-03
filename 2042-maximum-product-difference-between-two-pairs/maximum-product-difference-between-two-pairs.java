class Solution {
    public int maxProductDifference(int[] nums) {
      int max=0;
      int smax=0;
      int small=Integer.MAX_VALUE;
      int ssmall=Integer.MAX_VALUE;
      for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            smax=max;
            max=nums[i];
        }else if(nums[i]>smax){
            smax=nums[i];
        }
        if(nums[i]<small){
            ssmall=small;
            small=nums[i];
        }else if(nums[i]<ssmall){
            ssmall=nums[i];
        }
      } 
      return (max*smax)-(small*ssmall); 
    }
}