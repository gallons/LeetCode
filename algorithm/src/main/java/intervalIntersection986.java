import java.util.ArrayList;
import java.util.List;

public class intervalIntersection986 {
//
    public int[][] intervalIntersection(int[][] f,int[][] s){
        List<int[]> ans=new ArrayList<int[]>();
        int i=0;
        int j=0;
        while(i<f.length&&j<s.length){
            int lo=Math.max(f[i][0],s[j][0]);
            int lh=Math.min(f[i][1],s[j][1]);
            ans.add(new int[]{lo,lh});
        }
        if(f[i][1]<s[j][1]){
            i++;
        }else {
            j++;
        }

        return  ans.toArray(new int[ans.size()][]);

    }
}
