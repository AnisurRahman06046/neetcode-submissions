class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str:strs){
            int len = str.length();
            sb.append(len);
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            // get the index of "#"
            int j = str.indexOf("#",i); // scanning from i 
            // get the length of string
            int len = Integer.parseInt(str.substring(i,j));
            String s = str.substring(j+1,j+1+len);
            res.add(s);
            i = j+1+len;
        }
        return res;
    }
}
