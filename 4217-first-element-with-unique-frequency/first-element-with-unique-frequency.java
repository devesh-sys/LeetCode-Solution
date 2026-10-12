class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Map<Integer,Integer> fr=new HashMap<>();
        for(int freq:map.values()){
            fr.put(freq,fr.getOrDefault(freq,0)+1);
        }
        for(int num:nums){
            if(fr.get(map.get(num))==1)
            return num;
        }
        return -1;
    }
}