import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class singleNumber136 {
    //位运算  异或   0异或a=a   a异或a=0
    public int singleNumber(int[] nums) {
        int single=0;
        for(int num:nums){
            single^=num;
        }
        return single;

    }

    public int singleNumber2(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!arr.contains(nums[i])){
                arr.add(nums[i]);
            }else{
                int temp=nums[i];
                // 筛选出不是temp的集合
                arr = arr.stream().filter(e -> !(temp ==e)).collect(Collectors.toList());
            }
        }
        return arr.get(0);
    }
}
