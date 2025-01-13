class ContainerWithMoreWater{
    public int maxWater(int arr[]) {
        // Code Here
        if(arr.length<2){
            return 0;
        }
        int start = 0;
        int end = arr.length -1;
        int ans = 0;
        while(start<end){
            int width = end -start;
            int height = Math.min(arr[start],arr[end]);
            ans = Math.max(ans, width*height);
            if(arr[start]<arr[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return ans;
    }
}