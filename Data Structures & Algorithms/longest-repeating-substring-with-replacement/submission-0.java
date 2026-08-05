class Solution {
    public int characterReplacement(String s, int k) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        int left=0;
        int[] h=new int[n];
        h[0]=arr[0];
        for(int right=1;right<n;right++){
            if(arr[right]==h[right-1]){
                h[right]=arr[right];
            }else if(arr[right]!=h[right-1]&& k>0){
                h[right]=h[right-1];
                k--;
            }else{
                continue;
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(h[i]!= 0){
                count++;
            }
        }
        return count;
    }
}
