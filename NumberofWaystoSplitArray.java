class FactorialsLessthanorEqualton{
    public long subarrayXor(int arr[], int k) {
        // code here
        int n = arr.length;
        int xr =0;
        Map<Integer,Integer>mpp= new HashMap<>();
        mpp.put(xr,1);
        int cnt =0;
        for(int i =0;i<n;i++){
            xr=xr^arr[i];
            int x=xr^k;
            if(mpp.containsKey(x)){
                cnt+=mpp.get(x);
            }
            if(mpp.containsKey(xr)){
                mpp.put(xr,mpp.get(xr)+1);
            }
            else{
                mpp.put(xr,1);
            }
        }
        return cnt;
}