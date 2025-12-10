public class longest_repeating_character_replacement1{


    public static int characterReplacement(String s, int k) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            // Frequency array to store counts of each uppercase letter
            int[] freq = new int[26];

            // Variable to track the max frequency character in the current window
            int maxFreq = 0;

            // Inner loop to check substrings starting at i
            for (int j = i; j < s.length(); j++) {

                // Increase frequency of current character
                freq[s.charAt(j) - 'A']++;

                // Update most frequent character count in window
                maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);

                // Current window size
                int windowSize = j - i + 1;

                // Calculate replacements needed to make all characters same
                int replacements = windowSize - maxFreq;

                // If replacements are within k, update maxLength
                if (replacements <= k) {
                    maxLength = Math.max(maxLength, windowSize);
                }
                else{
                    break;
                }
            }
        }

        return maxLength;
    }
  

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }

}

