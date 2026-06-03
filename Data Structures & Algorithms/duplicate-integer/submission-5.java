class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> seen = new HashMap<>();
        for(int num: nums){
            seen.put(num,seen.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            if(seen.get(num)>1){
                return true;
            }
        }
        return false;
    }
}