public class rotatedarray153 {

    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int mid=0;
        int min=5001;
        while(left<right){
            mid=(left+right)/2;
            if(nums[mid]<=nums[right]){

                min=min>nums[mid]?nums[mid]:min;
                right=mid-1;

            }else{
                if(nums[left]<=nums[mid]){
                    min=min>nums[left]?nums[left]:min;
                    left=mid+1;
                }
            }


        }
        return min>nums[left]?nums[left]:min;


    }
}
