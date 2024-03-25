package likou;

import struct.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Test230 {

    //力扣第230题 求二叉搜索树中第k小的值
    public static void main(String[] args) {




    }



    //求二叉搜索树中第k小的值
    //方法1 求二叉搜索树的中序遍历
    public static int kthSmallest(TreeNode root, int k) {
        //使用栈实现中序遍历
        Stack<TreeNode> stack = new Stack<>();
        //存储遍历的位置
        int i = 0;
        int temp = 0;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            //左节点遍历完了
            if (!stack.isEmpty()){
                //将栈顶出栈
                TreeNode pop = stack.pop();
                temp = pop.val;
                i++;
                if (i == k) {
                    return temp;
                }
                //遍历右节点
                if (pop.right!=null){
                    root = pop.right;
                }

            }

        }
        return temp;
    }

    //求二叉搜索树中第k小的值
    //方法2 深度优先遍历递归
    public static int kthSmallest2(TreeNode root, int k) {




        return 0;
    }
}
