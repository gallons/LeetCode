public class numberOfArithmeticSlices413 {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        if(n<=2){
            return 0;
        }
        int sum=0;
        int[] dp=new int[n];
        for(int i=2;i<n;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                //dp[0]=0 dp[1]=0 dp[2]=1 dp[3]=2  dp表示新增的个数，不包括之前的 sum表示求和
                dp[i]=1+dp[i-1];
                sum+=dp[i];
            }
        }
        return sum;

    }
}
