import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*77. ���
*������������ n �� k�����ط�Χ [1, n] �����п��ܵ� k ��������ϡ�
����԰� �κ�˳�� ���ش𰸡�
* */
public class combinations77 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        combineHelper(n, k, 1);
        return result;
    }

    /**
     * ÿ�δӼ�����ѡȡԪ�أ���ѡ��ķ�Χ����ѡ��Ľ��ж�������������ѡ��ķ�Χ������Ҫ��startIndex
     * @param startIndex ������¼����ݹ���У����ϴ����￪ʼ���������Ͼ���[1,...,n] ����
     */
    private void combineHelper(int n, int k, int startIndex){
        //��ֹ����
        if (path.size() == k){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n - (k - path.size()) + 1; i++){
            path.add(i);
            combineHelper(n, k, i + 1);
            path.removeLast();
        }
    }
}
