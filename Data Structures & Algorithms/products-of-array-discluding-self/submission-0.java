class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        int sol=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j!=i){
                    sol=sol*nums[j];
                }
            }
            list.add(sol);
            sol=1;
        }
        int[] arr=list.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}  
