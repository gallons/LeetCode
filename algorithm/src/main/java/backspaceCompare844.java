public class backspaceCompare844 {
    //栈方式
    public boolean backspaceCompare(String s, String t) {
        return bulid(s).equals(bulid(t));

    }

    public String bulid(String st){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(ch!='#'){
                sb.append(ch);
            }else{
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        return sb.toString();
    }

    //双指针
    public static boolean backspaceCompare2(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        int flagi = 0, flagj = 0;
        while (i >= 0 || j >= 0) {//从最后的字符开始，往前进行比较
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    flagi++;
                    i--;
                } else if (flagi > 0) {//如果当前值不为#，且统计的#个数大于0，则i--,flagi--,即左移一位
                    i--;
                    flagi--;
                } else {
                    break;//如果统计#的个数没有，且当前值不为#,则当前字段可以用来跟另一个字符串的对应字符比较是否相等
                }
            }

            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    flagj++;
                    j--;
                } else if (flagj > 0) {//如果当前值不为#，且统计的#个数大于0，则i--,flagi--,即左移一位
                    j--;
                    flagj--;
                } else {
                    break;//如果统计#的个数没有，且当前值不为#,则当前字段可以用来跟另一个字符串的对应字符比较是否相等
                }
            }
            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j)) {
                    return false;
                }
            } else {
                if (i >= 0 || j >= 0) {
                    return false;
                }
            }
            i--;
            j--;


        }
        return true;
    }
}
