import java.util.HashSet;

public class IsHappy202 {
    public int getNext(int n){
        int total=0;
        while(n>0){
            int d=n%10;
            n=n/10;
            total+=d*d;
        }
        return total;
    }


    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(n!=1&&!set.contains(n)){
            set.add(n);
            n=getNext(n);
        }
        return n == 1;

    }
}
