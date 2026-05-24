class Solution {
    public int findMin(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        for(int num:nums){
            minVal = Math.min(num,minVal);
        }
        return minVal;
    }
}
