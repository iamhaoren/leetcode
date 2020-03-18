package leetcode;

import java.util.Stack;

public class 二叉树展开为链表 extends Base {

    //解题思路：
    //展开的链表为二叉树的先序遍历结果
    //但由于结果是以树结构的右指针为链表的链表
    //直接用先序遍历，会失去右节点
    //所以采用右-->左-->根的遍历形式

    //解法一：递归
    private TreeNode pre=null;
    public void flatten(TreeNode root) {
        if (root==null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.right=pre;
        root.left=null;
        pre=root;
    }

    //解法二：迭代
    public void flatten2(TreeNode root) {
        if (root==null)
            return;
        Stack<TreeNode> stack=new Stack<>();
        while (!stack.isEmpty()||root!=null){
            //找到最右节点
            while (root!=null){
                stack.push(root);
                root=root.right;
            }
            //这里不能pop,因为如果还要去左边
            //如果左边不为空，则回不来了
            root=stack.peek();
            //如果左边为空，或者已经访问过，则处理当前节点。
            //第二个条件不容易看出
            //如果节点不是叶子，那么不加第二个条件会死循环
            if (root.left==null||root.left==pre){
                root=stack.pop();
                root.right=pre;
                root.left=null;
                pre=root;
                root=null;
            }else {
                root=root.left;
            }
        }
    }
}
