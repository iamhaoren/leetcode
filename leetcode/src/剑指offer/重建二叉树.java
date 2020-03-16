package 剑指offer;

import java.util.Arrays;

public class 重建二叉树 extends Base{
//    输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
//    假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
//    例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
//    则重建二叉树并返回。

    /*解题思路：
    * 根据前、中序遍历的特点
    * 前序第一个节点为根节点
    * 根据根节点在中序遍历的位置，分割出两个子序列
    * 其左边为根节点的左子树，右边为根节点的右子树
    * 同理递归下去
    * */

    //解法一：原数组上操作
    //注意：下标
    public TreeNode reConstructBinaryTree(int[] pre,int[] in) {
        if (pre.length==0||in.length==0)
            return null;
        return helper(pre,0,pre.length-1,in,0,in.length-1);
    }

    private TreeNode helper(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preStart>preEnd||inStart>inEnd)
            return null;
        TreeNode root=new TreeNode(pre[preStart]);
        for (int i=inStart;i<=inEnd;i++){
            if (in[i]==pre[preStart]){
                root.left=helper(pre,preStart+1,preStart+i-inStart,in,inStart,i-1);
                root.right=helper(pre,preStart+i-inStart+1,preEnd,in,i+1,inEnd);
            }
        }
        return root;
    }

    //解法二：新数组上操作
    public TreeNode reConstructBinaryTree2(int [] pre,int [] in) {
        if (pre.length==0||in.length==0)
            return null;
        TreeNode root=new TreeNode(pre[0]);
        for (int i=0;i<in.length;i++){
            if (in[i]==pre[0]){
                root.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                root.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return root;
    }
}
