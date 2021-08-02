public class maxArea11 {
    public int maxArea(int[] height) {
        int len=height.length-1;//两点之间最多n-1个长度
        int le=0;
        int rh=len;
        int max=0;
        while(le<rh){
            if(height[le]<height[rh]){
                max= height[le]*len>max?height[le]*len:max;
                le++;
            }else{
                max= height[rh]*len>max?height[rh]*len:max;
                rh--;
            }
            len--;


        }
        return max;
    }
}
