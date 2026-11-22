class Solution {
    public boolean checkString(String s) {
        int a=0;
        int b=0;
        boolean f=false;
       for(char ch:s.toCharArray()){
        if(ch=='a'){
            a++;
        }else{
            b++;
            f=true;
        }
        if(f==true && ch=='a'){
            return false;
        }

       }
       return true;

    }
}