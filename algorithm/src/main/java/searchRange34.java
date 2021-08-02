public class searchRange34 {

    public int[] searchRange(int[] nums,int target){
        int[] res=new int[]{-1,-1};
        //��߽�
        res[0]=binarySearch(nums,target,true);
        res[1]=binarySearch(nums,target,false);
        return  res;
    }
    //leftOrRightΪtrue����߽� false���ұ߽�
    public int binarySearch(int[] nums, int target, boolean leftOrRight) {
        int res = -1;
        int left = 0, right = nums.length - 1, mid;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if(target < nums[mid])
                right = mid - 1;
            else if(target > nums[mid])
                left = mid + 1;
            else {
                res = mid;
                //����target == nums[mid]
                if(leftOrRight)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }
        return res;
    }

}



