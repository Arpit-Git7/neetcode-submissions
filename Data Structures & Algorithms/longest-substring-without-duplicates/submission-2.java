

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If we've seen this character before, shrink the window from the left
            // until the duplicate is removed.
            while (seen.contains(currentChar)) {
                seen.remove(s.charAt(left));
                left++;
            }
            
            // Add the new character to our window
            seen.add(currentChar);
            
            // Update the maximum length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}