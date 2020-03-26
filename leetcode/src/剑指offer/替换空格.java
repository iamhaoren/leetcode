package 剑指offer;

public class 替换空格 extends Base {
    //解法一：构造新String
    public String replaceSpace(StringBuffer str) {
        StringBuilder sb=new StringBuilder();
        for (char c:str.toString().toCharArray()){
            if (c==' ')
                sb.append("%20");
            else
                sb.append(c);
        }
        return sb.toString();
    }
    //解法二：原数组挪动
    //先根据空格进行扩容
    //然后从后往前移动元素

}
