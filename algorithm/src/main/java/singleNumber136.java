import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class singleNumber136 {
    //λ����  ���   0���a=a   a���a=0
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
                // ɸѡ������temp�ļ���
                arr = arr.stream().filter(e -> !(temp ==e)).collect(Collectors.toList());
            }
        }
        return arr.get(0);
    }
}
