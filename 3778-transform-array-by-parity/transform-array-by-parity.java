class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length-1;
        int []arr=new int[nums.length];
        for(int num:nums){
            if(num%2==1){
                arr[n]=1;
                n--;
            }
        }
        return arr;
    }
}