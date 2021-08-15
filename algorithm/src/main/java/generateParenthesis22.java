import java.util.ArrayList;
import java.util.List;

public class generateParenthesis22 {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<String>();
        backtrack(ans,new StringBuilder(),0,0,n);
        return ans;
    }
    public void backtrack(List<String> ans, StringBuilder cur,int left,int right,int max){
        if(cur.length()==max*2){
            ans.add(cur.toString());
            return;
        }
        if(left<max){
            cur.append('(');
            backtrack(ans,cur,left+1,right,max);
            cur.deleteCharAt(cur.length()-1);
        }
        if(right<left){
            cur.append(')');
            backtrack(ans,cur,left,right+1,max);
            cur.deleteCharAt(cur.length()-1);
        }

    }
}
