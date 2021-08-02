public class PowerOfTwo231 {
    //二进制表示   其中 & 表示按位与运算
    public boolean isPowerOfTwo(int n) {
        return n>0&&(n&(n-1))==0;
    }

    public boolean isPowerOfTwo2(int n) {
        return n > 0 && (n & -n) == n;
    }
}
/*
*  & 为二进制按位与
*
* */