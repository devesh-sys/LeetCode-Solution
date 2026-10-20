class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0;
        int j=1;
        int []arr=new int[nums.length];
        for(int num:nums){
            if(num%2==0){
                arr[i]=num;
                i+=2;
            }else if(num%2!=0){
                arr[j]=num;
                j+=2;
            }
        }
        return arr;
    }
}