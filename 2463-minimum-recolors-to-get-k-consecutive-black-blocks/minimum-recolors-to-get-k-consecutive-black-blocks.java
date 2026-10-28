class Solution {
    public int minimumRecolors(String blocks, int k) {
        int white=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                white++;
            }
        }
        int opr=white;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i)=='W'){
                white++;
            }
            if(blocks.charAt(i-k)=='W'){
                white--;
            }
            opr=Math.min(white,opr);
        }
        return opr;
    }
}