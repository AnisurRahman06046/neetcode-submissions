class Solution {
    public boolean checkAnargram(String s, String t){
        if(s.length()!=t.length()) return false;
        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i) - 'a';
            count[idx]++;
        }
        for(int i=0;i<t.length();i++){
            int idx = t.charAt(i)-'a';
            count[idx]--;
            if(count[idx]<0){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        
        for(int i=0;i<strs.length;i++){
            // check if visited or not
            if(visited[i]){
                continue;
            }
            List<String> group  = new ArrayList<>();
            group.add(strs[i]);
            visited[i]=true;
            for(int j=i+1;j<strs.length;j++){
                if(!visited[j] && checkAnargram(strs[i],strs[j])){
                    group.add(strs[j]);
                    visited[j]=true;
                }
            }
            res.add(group);
        }
        return res;
    }
}
