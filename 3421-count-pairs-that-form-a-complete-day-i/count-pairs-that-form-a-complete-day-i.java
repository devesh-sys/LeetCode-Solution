class Solution {
    public int countCompleteDayPairs(int[] hours) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int num:hours){
            int want=num%24;
            int comp=(24-want)%24;
            if(map.containsKey(comp)){
                count+=map.get(comp);
            }
                map.put(want,map.getOrDefault(want,0)+1);
        }
        return count;
    }
}