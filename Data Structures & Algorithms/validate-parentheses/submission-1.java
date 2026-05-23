class Solution {
    public boolean isValid(String s) {
       Stack<Character> store = new Stack<>();

       for(char c:s.toCharArray()){
        if(c=='(' || c=='{' || c=='['){
            store.push(c);
        }
        else{
            if(store.isEmpty()) return false;
            char top = store.pop();
            if(c==')' && top!='(' || c=='}' && top!='{' || c==']' && top!='['){
                return false;
            }

        }
       }
       return store.isEmpty();
    }
}
