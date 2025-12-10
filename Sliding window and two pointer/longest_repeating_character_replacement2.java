public class longest_repeating_character_replacement2 {

     public static int characterReplacement(String s, int k) {
        
        // Array to count frequency of characters in window
        int[] freq = new int[26];

        // Left pointer of sliding window
        int left = 0;

        // Tracks the highest frequency in the window
        int maxFreq = 0;

        // Stores result
        int maxLen = 0;
        int right=0;

        // Traverse the string with right pointer
        while(right<s.length()) {

            // Increment count of current character
            freq[s.charAt(right) - 'A']++;

            // Update max frequency in current window
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            // If number of changes exceeds k, shrink window
            int window=right-left+1;
            while ((window - maxFreq )> k) {
                freq[s.charAt(left) - 'A']--;
                maxFreq=0;
                for (int i = 0; i < 26; i++) {
                    maxFreq = Math.max(maxFreq, freq[i]);
                }
                left++;
                window = right - left + 1; 


            }

            if(window-maxFreq<=k){
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "AAABBCCD";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }
    
}
