class Solution {
    public int findMin(int[] nums) {
        // int minVal = Integer.MAX_VALUE;
        // for(int num:nums){
        //     minVal = Math.min(num,minVal);
        // }
        // return minVal;
        int l = 0;
        int r = nums.length - 1;
        while(l<r){
            int mid = l + (r-l)/2; //mid index 
            if(nums[mid]>nums[r]){
                l = mid + 1;
            }
            else {
                r = mid;
            }
        }
        return nums[l];
    }
}
