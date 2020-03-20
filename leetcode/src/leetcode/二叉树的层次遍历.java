package leetcode;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 二叉树的层次遍历 extends Base {
    //解法一：队列
    //遇到的问题：
    //如何判断某一层的开始或结束？（因为需要一层一层的添加）
    //解决：嵌套循环，外循环每次为一层，内循环用来处理每个节点。
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new LinkedList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> param=new LinkedList<>();
            int size=queue.size();
            for (int i=0;i<size;i++){
                TreeNode current=queue.poll();
                param.add(current.val);
                if (current.left!=null)
                    queue.add(current.left);
                if (current.right!=null)
                    queue.add(current.right);
            }
            result.add(param);
        }
        return result;
    }

    //解法二：递归
    //层次遍历并不适合递归的性质
    //但是可以用DFS的递归来实现BFS的效果
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> levelOrder2(TreeNode root) {
        if (root!=null)
            helper(root,1);
        return result;
    }
    private void helper(TreeNode root, int level) {
        if (level>result.size())
            result.add(new ArrayList<>());
            result.get(level-1).add(root.val);
        if (root.left!=null){
            helper(root.left,level+1);
        }
        if (root.right!=null){
            helper(root.right,level+1);
        }
    }
}
