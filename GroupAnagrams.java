import java.util.*;
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for(String s : strs){
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String s1 = new String(ch);
            if(!result.containsKey(s1)){
                result.put(s1, new ArrayList<>());
            }
            result.get(s1).add(s);
        }
        return new ArrayList<>(result.values());
    }

    
}
