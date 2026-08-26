class Solution {
    public boolean checkDivisibility(int n) {//devesh
        int sum=0;
        int product=1;
        int a=n;
        while(a!=0){
            sum+=a%10;
            product*=a%10;
            a/=10;
        }
        if(n%(sum+product)==0){
            return true;
        }
        return false;
    }
}