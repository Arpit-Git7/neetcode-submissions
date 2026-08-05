class Solution {
    public int maxProfit(int[] nums) {
        int n=nums.length;
        int min=999;
        int l=0;
        int max=0;
        int diff=0;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                max=min;
            }else{
                l=nums[i];
                max=Math.max(l,max);
                diff=max-min;
                int d1=0;
                d1=Math.max(d1,diff);
                diff=d1;
            }
        }
        return diff;
    }
}
