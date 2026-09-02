class Solution {
    public int trap(int[] height) {
        int water=0;
        int left=0;
        int right=height.length-1;
        int lh=0;
        int rh=0;
        while(left<right){
            if(height[left]<=height[right]){
                if(height[left]>=lh){
                    lh=height[left];
                }else{
                    water+=lh-height[left];
                }
                left++;
            }else{
                if(height[right]>=rh){
                    rh=height[right];
                }else{
                    water+=rh-height[right];
                }
                right--;
            }
        }
        return water;
    }
}