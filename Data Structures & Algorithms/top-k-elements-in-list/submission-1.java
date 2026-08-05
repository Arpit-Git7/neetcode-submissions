class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,int[]> map=new HashMap<>();
        int n=nums.length;
        int count=1;
        for (int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                count=count+1;
            }else if(nums[i]!=nums[i+1]){
                int key=nums[i];
                map.put(key,new int[]{nums[i],count});
                count=1;
            }
        }
        map.put(nums[n-1], new int[]{nums[n-1], count});
        List<Map.Entry<Integer,int[]>> entries= new ArrayList<>(map.entrySet());
        entries.sort((a,b)->b.getValue()[1]-a.getValue()[1]);
        int[] val=new int[k];
        for(int i=0;i<k;i++){
            val[i]=entries.get(i).getKey();
        }
        return val;
    }
}
