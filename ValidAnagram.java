import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> str1 = new HashMap<>();
        Map<Character, Integer> str2 = new HashMap<>();

        for (char c : s.toCharArray()) {
            str1.put(c, str1.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            str2.put(c, str2.getOrDefault(c, 0) + 1);
        }

        return str1.equals(str2);
    }
}
