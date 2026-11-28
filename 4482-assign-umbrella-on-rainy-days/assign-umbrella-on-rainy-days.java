class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n=rain.length;
      String []arr=new String[n];
      int ac=0;
      int bc=0;
      for(int i=0;i<n;i++){
     boolean alice=(i+1<n) && (rain[i]==1) && (rain[i+1]==1);
     boolean bob=(rain[i]==1);
     if(!alice && !bob){
        arr[i]="None";
     }else if(alice && !bob){
        arr[i]="Alice";
        ac++;
     }else if (!alice && bob) {
                arr[i] = "Bob";
                bc++;
            } else {
                if (ac <= bc) {
                    arr[i] = "Alice";
                    ac++;
                } else {
                    arr[i] = "Bob";
                    bc++;
                }
      }
      }
      return arr;
    }
}