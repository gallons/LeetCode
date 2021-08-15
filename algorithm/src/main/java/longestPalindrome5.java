public class longestPalindrome5 {
    //动态规划
    public String longestPalindrome(String s) {
        //特殊校验
        int len=s.length();
        if(len<2){
            return s;
        }
        //最大长度
        int maxLen=1;
        int begin=0;
        //dp[i][j]表示s[1,j]是否为回文
        boolean[][] dp=new boolean[len][len];
        for(int i=0;i<len;i++){
            dp[i][i]=true;//每个单独的字符都是回文
        }

        char[] charArray=s.toCharArray();
        for(int j=1;j<len;j++){
            for(int i=0;i<j;i++){
                if(charArray[i]!=charArray[j]){
                    dp[i][j]= false;
                }else{
                    if(j-i<3){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=dp[i+1][j-1];
                    }
                }

                // 只要 dp[i][j] == true 成立，就表示子串 s[i..j] 是回文，此时记录回文长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return  s.substring(begin, begin + maxLen);

    }
}
