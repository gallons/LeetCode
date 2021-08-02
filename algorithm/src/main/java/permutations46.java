import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 46. ȫ����
 *����һ�������ظ����ֵ����� nums �������� ���п��ܵ�ȫ���� ������� ������˳�� ���ش𰸡�
 */

public class permutations46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        List<Integer> output = new ArrayList<Integer>();
        for (int num : nums) {
            output.add(num);
        }

        int n = nums.length;
        backtrack(n, output, res, 0);
        return res;
    }

    public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
        // ��������������
        if (first == n) {
            res.add(new ArrayList<Integer>(output));
        }
        for (int i = first; i < n; i++) {
            // ��̬ά������
            Collections.swap(output, first, i);
            // �����ݹ�����һ����
            backtrack(n, output, res, first + 1);
            // ��������
            Collections.swap(output, first, i);
        }
    }
}
