public class hammingWeight191 {
//λ����
    public int hammingWeight(int n){
        int ret=0;
        while(n!=0){
            n=n&(n-1);
            ret++;
        }
        return ret;
    }
}
