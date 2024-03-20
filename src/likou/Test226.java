package likou;

import struct.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Test226 {

    //经典题目： 翻转二叉树
    public static void main(String[] args) {



    }


    //方法1 使用二叉树的层次遍历 依次交换左右节点的val
    public static TreeNode invertTree(TreeNode root) {
        //特殊情况处理
        if (root == null){
            return root;
        }
        //方法1 层次遍历使用队列 queue 通过使用队列，相当于使用了函数递归调用栈
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode temp = null;
        //根节点入队
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size>0){
                //获取并移除队头元素
                TreeNode  node = queue.poll();
                //将队头和它的子节点入队
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
                //交换队头元素左节点和右节点的位置
                if (node.left != null && node.right != null){
                    temp = node.left;
                    node.left = node.right;
                    node.right = temp;
                }
                if (node.left == null && node.right != null){
                    node.left = node.right;
                    node.right = null;
                    size--;
                    break;
                }
                if (node.right == null && node.left != null){
                    node.right = node.left;
                    node.left = null;
                    size--;
                    break;
                }
                size--;
            }
        }
        return root;
    }

    //方法2 使用递归的思想
    public static TreeNode invertTree1(TreeNode root) {
        //特殊情况处理
        if (root == null){
            return root;
        }
        //方法1 使用递归的思想
        TreeNode left = invertTree1(root.left);
        TreeNode right = invertTree1(root.right);
        root.left = right;
        root.right = left;
        return root;
    }


}
