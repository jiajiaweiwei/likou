package likou;

import struct.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class Test98 {

    //力扣第98题 验证二叉搜索树
    public static void main(String[] args) {

    }




    //方法1 子问题相同 使用递归
    public static boolean isValidBST(TreeNode root) {
        //递归
        return isTrue(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    //递归函数
    public static boolean isTrue(TreeNode root,int lower ,int upper){
        //子问题
        if (root == null){
            return true;
        }
        //子问题核心 不为二叉搜索树的条件
        if (root.val<=lower || root.val>=upper){
            return false;
        }
        //递归
        return isTrue(root.left,lower, root.val)&&isTrue(root.right, root.val, upper);
    }




    //方法2 中序遍历 判断子序列是不是递增
    public static boolean isValidBST2(TreeNode root) {
        //中序遍历顺序 左根右
        //使用栈 后进先出的特点
        Deque<TreeNode> stack = new LinkedList<>();
        double inorder = -Double.MAX_VALUE;
        while (!stack.isEmpty()||root!=null){
            while(root!=null){
                stack.push(root);
                //将左节点全部入栈
                root = root.left;
            }
            //当左边全部入栈后，后进先出 最左边出栈
            root = stack.pop();
            //判断是否符合二叉搜索树
            if (root.val<=inorder){
                return false;
            }
            inorder = root.val;
            root = root.right;
        }
        return true;

    }

    //方法3 使用递归实现   DFS中序遍历 并判断是否为二叉搜索树
    public static boolean inorderTraversal(){

        return true;
    }






}
