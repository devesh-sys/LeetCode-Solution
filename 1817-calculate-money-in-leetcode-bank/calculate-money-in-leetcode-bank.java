class Solution {
    public int totalMoney(int n) {
        if(n<=7){
            return n*(n+1)/2;
        }
        int money=0;
        int start=1;
        int day=1;
        for(int i=1;i<=n;i++){
            money+=day;
            day++;
            if(i%7==0){
                start++;
                day=start;
            }
        }
        return money;
    }
}