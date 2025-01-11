import java.util.HashSet;

public class Longestsubstringwithdistinctcharacters {
    if (s == null || s.length() == 0) return 0;
        int n = s.length(); 
        int maxLength = 0;  
        int left = 0;      
        HashSet<Character> set = new HashSet<>(); 
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
}
