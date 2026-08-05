class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]==1){
                count+=1;
            }
        }
        return count;
    }
}
