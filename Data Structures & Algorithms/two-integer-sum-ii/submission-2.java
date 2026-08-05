class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int[] arr=new int[2];
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(i==j){
                    continue;
                }
                if(numbers[i]+numbers[j]==target){
                    arr[0]=i+1;
                    arr[1]=j+1;
                    break;
                }
            }
        }
        return arr;
    }
}
