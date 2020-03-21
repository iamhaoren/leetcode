package leetcode;

public class 相交链表 extends   Base {

    //思路：如果两个链表长度相等
    //那么很简单，用两个指针同时加一遍历
    //如果有节点，那么会相等，没有节点，都会为null
    //而当两个链表长度不相等时
    //可以采用以下方式，让两个指针从同一个起点开始：
    //两个指针同时遍历，短的遍历完了，指向长的
    //长的遍历完了，指向短的
    //这样短指针相当于多走了长指针比他多的步数
    //就消除了距离差
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1=headA;
        ListNode p2=headB;
        while (p1!=p2){
            if (p1==null)
                p1=headB;
            else
                p1=p1.next;
            if (p2==null)
                p2=headA;
            else
                p2=p2.next;
        }
        return p1;
    }
}
