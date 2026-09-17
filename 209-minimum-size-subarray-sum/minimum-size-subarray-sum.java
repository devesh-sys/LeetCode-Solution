class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int mincount=Integer.MAX_VALUE;
        int n=nums.length;
        int sum=0;
        while(j<n){
            sum+=nums[j];
            while(sum>=target){
                mincount=Math.min(mincount,j-i+1);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        if(mincount==Integer.MAX_VALUE) return 0;
        return mincount;
    }
}