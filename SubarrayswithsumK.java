import java.util.HashMap;

class SubarrayswithsumK{
   public int countSubarrays(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1); 

        int currentSum = 0;
        int count = 0;

        for (int num : arr) {
            currentSum += num;
            if (prefixSumMap.containsKey(currentSum - k)) {
                count += prefixSumMap.get(currentSum - k);
            }
            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }

        return count;
        
        // int count =0;
        // for(int i =0;i<arr.length;i++){
        //     for(int j=i;j<arr.length;j++){
        //         int sum =0;
        //         for(int m =i;m<=j;m++)
        //             sum+=arr[m];
        //         if(sum==k)
        //             count++;
        //     }
        // }
        // return count;
    }
}