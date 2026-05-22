class Solution {
    public int characterReplacement(String s, int k) {
        // int[] freq = new int[26];
        Map<Character,Integer> freq = new HashMap<>();
        
        int left = 0;
        int maxFreq = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            // freq[c - 'A']++;
            freq.put(c,freq.getOrDefault(c,0)+1);

            // maxFreq = Math.max(maxFreq, freq[c - 'A']);
            maxFreq = Math.max(maxFreq,freq.get(c));

            while ((right - left + 1) - maxFreq > k) {
                // freq[s.charAt(left) - 'A']--;
                char ch = s.charAt(left);
                freq.put(ch,freq.get(ch)-1);
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
