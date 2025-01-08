import java.util.Arrays;

public class Countthenumberofpossibletriangles {
    static int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        for (int k = n - 1; k >= 2; k--) {
            int i = 0; 
            int j = k - 1; 

            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    count += (j - i);
                    j--; 
                } else {
                    i++; 
                }
            }
        }

        return count;
    }
}
