class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
     int nums[]=new int[2];
     for(int num:students){
        nums[num]++;
     } 
     int len=sandwiches.length;
     for(int num:sandwiches){
        if(nums[num]==0) break;
        if(len--==0) break;
        nums[num]--;
     } 
     return len;
    }
}