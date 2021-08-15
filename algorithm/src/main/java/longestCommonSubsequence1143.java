import java.util.Arrays;

public class longestCommonSubsequence1143 {
        public int longestCommonSubsequence(String text1, String text2) {
            if(text1!=null&&text1.equals(text2)){
                return text1.length();
            }
            int m=text1.length();
            int n=text2.length();
            int[][] dp=new int[m+1][n+1];
            for(int i=1;i<=m;i++){
                char t1=text1.charAt(i-1);
                for(int j=1;j<=n;j++){
                    char t2=text2.charAt(j-1);
                    if(t1==t2){
                        dp[i][j]=dp[i-1][j-1]+1;
                    }else{
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
            return dp[m][n];

        }
}
