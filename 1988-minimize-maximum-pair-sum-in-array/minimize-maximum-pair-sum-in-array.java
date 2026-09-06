class Solution {
    public int minPairSum(int[] nums) {
    Arrays.sort(nums);
    int maxsum=0;
    int n=nums.length;
    for(int i=0;i<n/2;i++){
        int sum=nums[i]+nums[n-1-i];
        maxsum=Math.max(sum,maxsum);
    }
    return maxsum; 
    }
}