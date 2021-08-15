public class canJump55 {
    public boolean canJump(int[] nums) {
        if(nums==null||nums.length==0) return false;
        int n=nums.length;
        //最远距离
        int rightMax=0;
        for(int i=0;i<n;i++){
            //当前位置不超过目前最大的距离，则取两者之间最大
            if(i<=rightMax){
                rightMax=Math.max(rightMax,i+nums[i]);
            }
            //当最远距离大于等于总长度时，则是可达的
            if(rightMax>=n-1){
                return true;
            }
        }
        return false;


    }
}
