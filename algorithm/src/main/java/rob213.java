public class rob213 {
    //动态规划 找最优
    public int rob(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int max=0;
        if(nums.length==1){
            max=nums[0];
        }else if(nums.length==2) {
            max=Math.max(nums[0],nums[1]);
        }else{
            //因为首尾相连，所以不能只能选(0，n-2) 和（1，n-1）中的最大值
            max=Math.max(robSum(nums,0,nums.length-2),robSum(nums,1,nums.length-1));
        }

        return max;


    }

    public int robSum(int[] nums,int start ,int end){
        int first=nums[start];
        int second=Math.max(first,nums[start+1]);

        for(int i=start+2;i<=end;i++){
            int temp=second;
            second=Math.max(first+nums[i],second);
            first=temp;
        }
        return second;
    }
}
