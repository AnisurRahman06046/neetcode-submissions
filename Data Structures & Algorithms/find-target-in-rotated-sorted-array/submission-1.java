class Solution {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while(l <= r){

            int mid = l + (r - l) / 2;

            // target found
            if(nums[mid] == target){
                return mid;
            }

            // LEFT HALF SORTED
            if(nums[l] <= nums[mid]){

                // target inside left half
                if(target >= nums[l] && target < nums[mid]){
                    r = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }

            // RIGHT HALF SORTED
            else{

                // target inside right half
                if(target > nums[mid] && target <= nums[r]){
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
            }
        }

        return -1;
    }
}