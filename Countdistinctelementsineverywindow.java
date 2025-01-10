class Countdistinctelementsineverywindow{
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }
        result.add(freqMap.size()); 
        for (int i = k; i < n; i++) {
            int outgoing = arr[i - k];
            freqMap.put(outgoing, freqMap.get(outgoing) - 1);
            if (freqMap.get(outgoing) == 0) {
                freqMap.remove(outgoing);
            }
            int incoming = arr[i];
            freqMap.put(incoming, freqMap.getOrDefault(incoming, 0) + 1);
            result.add(freqMap.size());
        }

        return result;
    }
}