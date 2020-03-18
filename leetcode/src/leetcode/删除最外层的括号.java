package leetcode;

public class 删除最外层的括号 extends Base {


    //整道题的思想是栈的思想
    //但是由于题的简单，可以用一个变量来代替

    //解法一:
    //头尾指针+截取子字符串
    //由于需要截取字符串所以时间效率较低
    public String removeOuterParentheses(String S) {
        int count=0;
        int start=0;
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if (c=='(')
                count++;
            if (c==')')
                count--;
            if (count==0){
                sb.append(S.substring(start+1,i));
                start=i+1;
            }
        }
        return sb.toString();
    }

    //解法二：
    //由于题目给的是有效括号字符串
    //也就是括号肯定成对
    //所以可以直接一对一对的考虑，不是第一对的，就都添加。
    //这样可以在遍历的同时直接得到结果。
    public String removeOuterParentheses2(String S) {
        StringBuilder sb=new StringBuilder();
        int couple=0;
        for (char c:S.toCharArray()){
            if (c=='('&&(couple+=1)>1)sb.append(c);
            if (c==')'&&(couple-=1)>=1)sb.append(c);
        }
        return sb.toString();
    }
}
