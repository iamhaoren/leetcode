package leetcode;

public class 回文链表 extends Base {
    //解法一：快慢指针
    //用快慢指针找到中点，并在遍历的同时反转前半部分
    //然后同时向左向右判断
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode pre=null;
        ListNode temp=null;
        while (fast!=null&&fast.next!=null){
            //注意逻辑顺序
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
            temp.next=pre;
            pre=temp;
        }
        if (fast!=null)
            slow=slow.next;
        while (slow!=null){
            if (slow.val!=pre.val)
                return false;
            slow=slow.next;
            pre=pre.next;
        }
        return true;
    }

    //解法二：递归+双指针
    //利用递归回溯的性质，在回溯反序的时候用另一个指针顺序判断

    ListNode p1=null;
    public boolean isPalindrome2(ListNode head) {
        p1=head;
        return helper(head);
    }

    private boolean helper(ListNode p2) {
        if (p2!=null){
            if (!helper(p2.next))return false;
            if (p1.val!=p2.val) return false;
            p1=p1.next;
        }
        return true;
    }
}
