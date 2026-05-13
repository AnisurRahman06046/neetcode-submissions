class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> seen = new HashMap<>();
        seen.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            int complement = target - nums[i];
            if(seen.containsKey(complement)){
                return new int[] {seen.get(complement),i};
                
            }
            seen.put(nums[i],i);
        }
        return new int[]{};
    }
}
