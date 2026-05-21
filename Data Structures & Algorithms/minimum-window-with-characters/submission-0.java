

class Solution {
    public String minWindow(String s, String t) {

        Map<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int req = need.size();
        int formed = 0;

        Map<Character, Integer> window = new HashMap<>();

        int left = 0;
        int minL = Integer.MAX_VALUE;
        int minStart = 0;

        for (int r = 0; r < s.length(); r++) {

            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) &&
                window.get(c).intValue() == need.get(c).intValue()) {
                formed++;
            }

            while (formed == req) {

                if (r - left + 1 < minL) {
                    minL = r - left + 1;
                    minStart = left;
                }

                char ch = s.charAt(left);
                window.put(ch, window.get(ch) - 1);

                if (need.containsKey(ch) &&
                    window.get(ch) < need.get(ch)) {
                    formed--;
                }

                left++;
            }
        }

        return (minL == Integer.MAX_VALUE)
                ? ""
                : s.substring(minStart, minStart + minL);
    }
}