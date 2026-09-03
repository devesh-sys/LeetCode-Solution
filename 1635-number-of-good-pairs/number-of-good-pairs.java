class Solution {
    public int numIdenticalPairs(int[] nums) {
        int []arr=new int[101];
        for(int a:nums){
           arr[a]++; 
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1){
                count+=arr[i]*(arr[i]-1)/2;
            }
        }
        return count;
    }
}