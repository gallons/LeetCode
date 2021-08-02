import java.util.ArrayList;
import java.util.List;

public class findAnagrams438 {

    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int m=p.length();
        List<Integer> ans=new ArrayList<>();
        if(n<m) return ans;
        int[] pCnt=new int[26];
        int[] sCnt=new int[26];

        for(char c: p.toCharArray()){
            pCnt[c-'a']++;
        }
        int left=0;
        for(int right=0;right<n;right++){
            int curRight=s.charAt(right)-'a';
            sCnt[curRight]++;
            while(sCnt[curRight]>pCnt[curRight]){//如果数组中的数据多于p,则从left开始减减
                int curleft=s.charAt(left)-'a';
                left++;
                sCnt[curleft]--;

            }
            if(right-left+1==m){
                ans.add(left);
            }
        }
        return ans;

    }
}
