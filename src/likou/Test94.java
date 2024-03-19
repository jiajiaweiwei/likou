package likou;

import struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Test94 {



    //二叉树的中序遍历
    public static void main(String[] args) {





    }





    public static List<Integer> inorderTraversal(TreeNode root) {
        //返回的中序遍历集合
        List<Integer> integers = new ArrayList<>();
        //中序遍历：左根右
        //递归
        inorder(root,integers);
        return integers;
    }
    public static void inorder(TreeNode node,List<Integer> integers){
        if (node == null){
            return;
        }
        inorder(node.left,integers);
        integers.add(node.val);
        inorder(node.right,integers);
    }



}
