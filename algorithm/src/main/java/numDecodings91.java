public class numDecodings91 {
    public int numDecodings(String s) {
        //输入的数字，转成字母的种类
        int n=s.length();
        int[] f=new int[n+1];//{0,0,0,0}的形式
        f[0]=1;
        for(int i=1;i<=n;i++){
            if(s.charAt(i-1)!='0'){
                f[i]+=f[i-1];
            }
            if(i>1&&s.charAt(i-2)!='0'&&((s.charAt(i-2)-'0')*10+(s.charAt(i-1)-'0')<=26)){
                f[i]+=f[i-2];
            }
        }

        return f[n];

    }
}
