class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>>res;
        unordered_map<string,vector<string>>mp;
        for(string word:strs){
            vector<int>freq(26,0);
            for(char c:word){
                freq[c-'a']++;
            }
            string key="";
            for(int i=0;i<26;i++){
                key+='#'+to_string(freq[i]);
            }
            mp[key].push_back(word);
        }
        for(auto ch:mp){
            res.push_back(ch.second);
        }
        return res;
    }
};
