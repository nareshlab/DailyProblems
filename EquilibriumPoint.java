class EquilibriumPoint{
    public static int findEquilibrium(int arr[]) {
        // code here
        int total = 0;
        for(int nums:arr){
            total +=nums;
        }
        int leftsum =0;
        int rightsum =0;
        for(int i =0;i<arr.length;i++){
            rightsum = total - leftsum -arr[i];
            if(leftsum==rightsum){
                return i ;
            }
            leftsum+=arr[i];
        }
        return -1;
    }
}