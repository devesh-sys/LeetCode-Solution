class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] str=s.split(" ");
        if(pattern.length()!=str.length){
            return false;
        }
        HashMap<Character,String> map=new HashMap<>();
        for(int i=0;i<str.length;i++){
            char ch=pattern.charAt(i);
            String st=str[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(st)){
                    return false;
                }
            }else{
                if(map.containsValue(st)){
                    return false;
                }
                map.put(ch,st);
            }
        }
        return true;
    }
}