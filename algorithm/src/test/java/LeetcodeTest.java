import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class LeetcodeTest {
    public static void main(String[] args) {

        int[] nums={1, 2, 5};
        coinChange322 coinChange322 = new coinChange322();
        System.out.println(coinChange322.coinChange(nums,11));
       // System.out.println(wordBreak("catsandog",list));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
