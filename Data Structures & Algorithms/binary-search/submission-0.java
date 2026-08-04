class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int t=nums[n/2];
        int j=0;
        if(target==t){
            j= n/2;
        }else if(target>t){
            for(int i=n/2;i<n;i++){
                if(nums[i]==target){
                    j= i;
                }
            }
        }else{
            for(int i=0;i<n/2;i++){
                if(nums[i]==target){
                    j= i;
                }
            }
        }
        if(j==0){
            return -1;
        }else{
            return j;
        }
    }
}
