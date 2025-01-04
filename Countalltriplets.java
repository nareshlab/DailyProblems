public class Countalltriplets {
    public int countTriplets(int[] arr, int target) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum == target) {
                    count++;
                    j++; 
                    while (j < k && arr[j] == arr[j - 1]) { 
                        j++; 
                    }
                } else if (sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return count;
    }
}
