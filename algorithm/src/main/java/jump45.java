public class jump45 {
    public int jump(int[] nums) {

        if(nums==null||nums.length==0) return 0;
        int n=nums.length;
        int rightSum=0;//最大值
        int count=0;//次数
        int end=0;//最右端
        for(int i=0;i<n-1;i++){
            rightSum=Math.max(rightSum,i+nums[i]);

            if(i==end){//遍历一次最远范围内，取其中的最大值rightsum
                end=rightSum;
                count++;
                if(end>=n-1){
                    return count;
                }
            }
        }

        return count;
    }
}
