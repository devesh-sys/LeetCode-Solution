class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> set=new ArrayList<>();
        int []arr=new int[100001];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                set.add(i);
            }
        }
        return set;
    }
}