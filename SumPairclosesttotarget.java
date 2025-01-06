import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumPairclosesttotarget {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        List<Integer> result = new ArrayList<>();
        if (arr == null || arr.length < 2) {
            return result;
        }
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int closestSum = arr[left] + arr[right];
        int[] closestPair = {arr[left], arr[right]};
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                closestSum = currentSum;
                closestPair[0] = arr[left];
                closestPair[1] = arr[right];
            }
            else if (Math.abs(currentSum - target) == Math.abs(closestSum - target)) {
                int currentDiff = Math.abs(arr[left] - arr[right]);
                int closestDiff = Math.abs(closestPair[0] - closestPair[1]);
                if (currentDiff > closestDiff) {
                    closestPair[0] = arr[left];
                    closestPair[1] = arr[right];
                }
            }
            if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        result.add(closestPair[0]);
        result.add(closestPair[1]);

        return result;
    }
}
