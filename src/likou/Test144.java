package likou;

import struct.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Test144 {
    //二叉树的前序遍历
    public static void main(String[] args) {


    }




    //使用递归实现二叉树的前序遍历
    public static List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<Integer> integers = new LinkedList<>();
        helper(root,integers);
        return  integers;
    }
    //递归函数
    public static void helper(TreeNode root,List<Integer> integers){
        if (root == null){
            return;
        }
        integers.add(root.val);
        helper(root.left,integers);
        helper(root.right,integers);
    }
}
