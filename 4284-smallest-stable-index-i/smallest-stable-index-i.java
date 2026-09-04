class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length-1;
        int index=-1;
        for(int i=0;i<=n;i++){
            int large=Integer.MIN_VALUE;
            int small=Integer.MAX_VALUE;
            int j=0;
            while(j<=i){
                large=Math.max(nums[j],large);
                j++;
            }
            j=i;
            while(j<=n){
                small=Math.min(small,nums[j]);
                j++;
            }
            int score=large-small;
            if(score<=k){
                return i;
            }
        }
        return -1;
    }
}