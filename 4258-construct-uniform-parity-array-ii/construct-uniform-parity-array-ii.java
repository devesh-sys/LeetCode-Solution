class Solution {
    public boolean uniformArray(int[] nums1) {
        int miniodd=Integer.MAX_VALUE;
        int minieven=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            int num=nums1[i];
            if(num%2==0){
                minieven=Math.min(num,minieven);
            }else{
                miniodd=Math.min(num,miniodd);
            }
        }
        if(miniodd==Integer.MAX_VALUE || minieven==Integer.MAX_VALUE){
            return true;
        }
        return minieven>miniodd;
    }
}