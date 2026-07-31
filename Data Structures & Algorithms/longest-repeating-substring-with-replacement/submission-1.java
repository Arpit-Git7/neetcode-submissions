class Solution {
    public int characterReplacement(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int left = 0;
        int[] counts = new int[26];
        int maxFreq = 0; 
        int count = 0;   
        for(int right = 0; right < n; right++){
            counts[arr[right] - 'A']++;
            maxFreq = Math.max(maxFreq, counts[arr[right] - 'A']);
            int windowSize = right - left + 1;
            if (windowSize - maxFreq > k) {
                counts[arr[left] - 'A']--;
                left++; 
            }
            
            count = Math.max(count, right - left + 1);
        }
        
        return count;
    }
}