class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Create the list that will hold all of our valid triplets
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        int n = nums.length;
        
        // Loop through the array. We stop at n - 2 because we need at least 3 elements
        for (int i = 0; i < n - 2; i++) {
            
            // Skip duplicates for the first number to avoid duplicate triplets in the result
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Set up our two pointers for the remaining portion of the array
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // We found a valid triplet! Add it to the list
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip any duplicate numbers for the left and right pointers
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    // Move both pointers inward to look for more valid pairs
                    left++;
                    right--;
                    
                } else if (sum < 0) {
                    // The sum is too small, move the left pointer to get a larger number
                    left++;
                } else {
                    // The sum is too large, move the right pointer to get a smaller number
                    right--;
                }
            }
        }
        
        return result;
    }
}