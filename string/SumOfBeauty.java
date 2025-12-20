import java.util.HashMap;
import java.util.Map;

public class SumOfBeauty {

    public static void main(String[] args) {
        String s="aabcb";
        System.out.println(beautySum(s));
    }
    public static int beautySum(String s) {
        // code here
        int n = s.length();
        int totalBeauty = 0;

        // Fix starting index
        for (int i = 0; i < n; i++) {

            Map<Character, Integer> freqMap = new HashMap<>();

            // Expand substring ending at j
            for (int j = i; j < n; j++) {

                char ch = s.charAt(j);
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                // Find max and min non-zero frequencies
                for (int count : freqMap.values()) {
                    maxFreq = Math.max(maxFreq, count);
                    minFreq = Math.min(minFreq, count);
                }

                totalBeauty += (maxFreq - minFreq);
            }
        }

        return totalBeauty; 
    }
}

