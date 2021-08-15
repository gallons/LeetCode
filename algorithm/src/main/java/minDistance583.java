public class minDistance583 {
    public int minDistance(String word1, String word2) {
        int w1=word1.length();
        int w2=word2.length();
        int[][] dp=new int[w1+1][w2+1];
        //先求出最大子序列
        for(int i=1;i<=w1;i++){
            char t1=word1.charAt(i-1);
            for(int j=1;j<=w2;j++){
                char t2=word2.charAt(j-1);
                if(t1==t2){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        //两个单词长度-2*最大子序列
        return w1+w2-2*dp[w1][w2];
    }
}
