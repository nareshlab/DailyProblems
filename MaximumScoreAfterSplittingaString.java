class MaximumScoreAfterSplittingaString{
    public static int maxScore(String s) {
        char [] ch = s.toCharArray();
        int zeros = 0;
        int max =0;
        int ones =0;
        for(char c:ch){
            if(c=='1'){
                ones++;
            }
        }
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]=='0'){
                zeros++;
            }
            else{
                ones--;
            }
            int current = zeros+ones;
            max = Math.max(max, current);
        }
        return max;
    }
}