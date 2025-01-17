class Productarraypuzzle{
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        if (n == 0) {
            return new int[0]; 
        }

        int[] prefix = new int[n];
        int[] postfix = new int[n];
        int[] res = new int[n];
        prefix[0] = 1;         
        postfix[n - 1] = 1;     
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            postfix[i] = postfix[i + 1] * arr[i + 1];
        }
        for (int i = 0; i < n; i++) {
            res[i] = prefix[i] * postfix[i];
        }

        return res;
    }

}