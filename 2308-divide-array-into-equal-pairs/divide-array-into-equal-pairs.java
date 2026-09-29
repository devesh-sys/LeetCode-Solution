class Solution {
    public boolean divideArray(int[] nums) {
       int []arr=new int[501];
       for(int num:nums){
        arr[num]++;
       } 
       for(int freq:arr){
        if(freq%2!=0){
            return false;
        }
       }
       return true;
    }
}