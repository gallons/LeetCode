public class PowerOfTwo231 {
    //�����Ʊ�ʾ   ���� & ��ʾ��λ������
    public boolean isPowerOfTwo(int n) {
        return n>0&&(n&(n-1))==0;
    }

    public boolean isPowerOfTwo2(int n) {
        return n > 0 && (n & -n) == n;
    }
}
/*
*  & Ϊ�����ư�λ��
*
* */