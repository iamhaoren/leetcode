package 剑指offer;

import java.util.ArrayList;

public class 从尾到头打印链表 extends Base {
    //递归
    ArrayList<Integer> list=new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (list!=null){
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }
    //栈。。。
}
