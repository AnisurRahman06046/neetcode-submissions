class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int longest = 0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum=num;
                int count = 1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}
