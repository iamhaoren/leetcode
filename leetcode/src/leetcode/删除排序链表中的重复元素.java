package leetcode;

public class 删除排序链表中的重复元素 extends Base{

    public ListNode deleteDuplicates(ListNode head) {
        ListNode p=head;
        while (p!=null&&p.next!=null){
            if (p.val==p.next.val)
                p.next=p.next.next;
            else
                p=p.next;
        }
        return head;
    }
}
