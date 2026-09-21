class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rightsum=totalsum-sum;
            int leftsum=sum-nums[i];
            if(rightsum==leftsum){
                return i;
            }
        }
        return -1;
    }
}