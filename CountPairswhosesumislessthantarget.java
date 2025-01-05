import java.util.Arrays;

public class CountPairswhosesumislessthantarget {
    public static int countPairs(int[] arr, int target) {
        int count = 0;
        Arrays.sort(arr); 

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum < target) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}
