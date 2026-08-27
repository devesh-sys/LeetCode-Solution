class Solution {
    public boolean isPalindrome(String s) {
       int left=0;
       int right=s.length()-1;
       while(left<right){
        char c=s.charAt(left);
        char h=s.charAt(right);
        if(!Character.isLetterOrDigit(c)){
            left++;
        }else if(!Character.isLetterOrDigit(h)){
            right--;
        }else{
            if(Character.toLowerCase(c)!=Character.toLowerCase(h)){
                return false;
            }
            left++;
            right--;
        }
       }
       return true; 
    }
}