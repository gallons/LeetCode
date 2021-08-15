public class findNumberOfLIS673 {
    public int findNumberOfLIS(int[] nums) {

        if(nums.length==0) return 0;

        int[] dp=new int[nums.length];
        //让每个dp都初始化为1
        dp[0]=1;
        for(int i=1;i<nums.length;i++){
            //让每个dp都初始化为1
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
        }

        int maxsum=dp[0];
        int count=1;
        for(int k=1;k<dp.length;k++){
            if(dp[k]>dp[k-1]){
                maxsum=dp[k];
                count=1;
            }
            if(dp[k]==maxsum){
                count++;
            }

        }

        return count;
    }
}
