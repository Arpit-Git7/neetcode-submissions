class Solution {
    public boolean isPalindrome(String s) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        int j=n-1;
        for(int i=0;i<j;i++){
            if(!Character.isLetterOrDigit(arr[i])){
                continue;
            }
            if(!Character.isLetterOrDigit(arr[j])){
                continue;
            }
            if(arr[i]!=arr[j]){
                return false;
            }
            j-=1;
        }
        return true;
    }
}
