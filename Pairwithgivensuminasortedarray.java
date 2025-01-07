import java.util.HashMap;

public class Pairwithgivensuminasortedarray {
    int countPairs(int arr[], int target) {
        // Complete the function
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return count;
    }
    
}
