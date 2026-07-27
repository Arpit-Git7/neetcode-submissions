class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int m1=0;
        int m2=0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(heights[i]>heights[j]){
                    m1=(j-i)*heights[j];
                    m2=Math.max(m1,m2);
                }else{
                    m1=(j-i)*heights[i];
                    m2=Math.max(m1,m2);
                }
            }
        }
        return m2;
    }
}
