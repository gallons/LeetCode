public class minSubArrayLen209 {
    public int minSubArrayLen(int target, int[] nums) {
        //滑动窗口
        if(nums.length==0) return 0;
        int ans=Integer.MAX_VALUE;
        int start=0,end=0;
        int sum=0;
        while(end<nums.length){
            sum+=nums[end];
            while(sum>=target){
                ans=Math.min(ans,end-start+1);
                sum-=nums[start];
                start++;

            }
            end++;
        }
        return ans==Integer.MAX_VALUE?0:ans;

    }
}
