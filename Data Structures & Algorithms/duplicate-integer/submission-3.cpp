class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int>s;
        for(int v:nums){
            if(s.count(v)>0){
                return true;
            }
            else{
                s.emplace(v);
            }
        }
        return false;
    }
};