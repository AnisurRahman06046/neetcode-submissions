class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i)-'a';
            count[idx]++;
        }
        for(int i=0;i<t.length();i++){
            int idx = t.charAt(i) - 'a';
            count[idx]--;
            if(count[idx]<0){
                return false;
            }
        }
        return true;
        // HashMap<Character,Integer>scount = new HashMap<>();
        // HashMap<Character,Integer>tcount = new HashMap<>();

        // for(int i=0;i<s.length();i++){
        //     char ch = s.charAt(i);
        //     scount.put(ch,scount.getOrDefault(ch,0)+1);
        // }
        // for(int i=0;i<t.length();i++){
        //     char ch = t.charAt(i);
        //     tcount.put(ch,tcount.getOrDefault(ch,0)+1);
        // }
        // if(scount.equals(tcount)){
        //     return true;
        // }
        // else{
        //     return false;
        // }
    }
}
