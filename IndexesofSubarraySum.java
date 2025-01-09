import java.util.ArrayList;

public class IndexesofSubarraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int n = arr.length;
        int left =0;
        int sum =0;
        for(int right = 0;right<n;right++){
            sum+=arr[right];
            while(sum>target&&left<=right){
                sum -= arr[left];
                left++;
            }
            if(sum==target){
                ArrayList <Integer> result = new ArrayList<>();
                result.add(left+1);
                result.add(right+1);
                return result;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(-1);
        return result;
    }
}
