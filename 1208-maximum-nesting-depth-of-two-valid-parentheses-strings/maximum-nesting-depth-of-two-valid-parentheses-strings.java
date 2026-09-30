class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int ans[]=new int[seq.length()];
        int dep=0;
        for(int i=0;i<seq.length();i++){
            char brac=seq.charAt(i);
            if(brac=='('){
                dep++;
                ans[i]=dep%2;
            }else{
                ans[i]=dep%2;
                dep--;
            }
        }
        return ans;
    }
}