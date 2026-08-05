class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int[] arr=new int[2];
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(i==j){
                    j++;
                    continue;
                }
                if(numbers[i]+numbers[j]==target){
                    arr[0]=numbers[i];
                    arr[1]=numbers[j];
                    break;
                }
            }
        }
        return arr;
    }
}
