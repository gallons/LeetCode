import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetcodeTest {
    public static void main(String[] args) {
        int[] nums={10,9,10,4,3,8,3,3,6,2,10,10,9,3};
        String s="a#c";
        String t="a#c";
      System.out.println(numSubarrayProductLessThanK(nums,19));

    }


    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        if(nums.length==0) return 0;
        int n=nums.length;
        int sum=0;
        int ans=0;
        HashMap map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
           if(map.get(nums[i])!=null){
               continue;
           }
            map.put(nums[i],1);

            sum=nums[i];
            int  end=i+1;
            while(end<=n){
                if(sum<k){
                    ans++;
                    if(end<n){
                    sum*=nums[end];}

                }else{
                    if(end<n){
                    sum=sum/nums[end-1]*nums[end];}
                }
                end++;
            }
        }
        return ans;

    }
}
