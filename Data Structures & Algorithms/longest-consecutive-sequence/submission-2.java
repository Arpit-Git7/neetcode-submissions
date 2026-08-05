class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0)return 0;
        int n=nums.length;
        int count=1;
        int maxCount=0;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]==1){
                
                count+=1;
            }if(nums[i]-nums[i-1]>1){
                maxCount=Math.max(maxCount,count);
                count=1;
            }
        }
        return maxCount;
    }
}
