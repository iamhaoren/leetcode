package leetcode;

public class 反转链表 extends Base {

    //解法一：三指针迭代
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode next=null;
        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }

    //解法二：递归
    ListNode result=null;
    public ListNode reverseList2(ListNode head) {
        helper(head);
        return result;
    }

    private ListNode helper(ListNode head) {
        if (head.next==null){
            result=head;
            return head;
        }
        helper(head.next).next=head;
        head.next=null;
        return head;
    }

    //优雅版递归
    //上面的递归，返回值的问题处理的不够优雅
    //只能再添加一个辅助函数
    public ListNode reverseList3(ListNode head) {
       if (head==null||head.next==null)
           return head;
       ListNode result=reverseList(head.next);
       head.next.next=head;
       head.next=null;
       return result;
    }
}
