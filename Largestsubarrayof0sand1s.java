import java.util.HashMap;

public class Largestsubarrayof0sand1s {
    public int maxLen(int[] arr) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int maxlen =0;
        int prefixsum =0;
        for(int i =0;i<arr.length;i++){
            prefixsum += (arr[i]==0)?-1:1;
            if(map.containsKey(prefixsum)){
                maxlen = Math.max(maxlen, i-map.get(prefixsum));
                
            }
            else{
                map.put(prefixsum,i);
            }
        }
        return maxlen;
    }
    
}
