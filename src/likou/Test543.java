package likou;

import struct.TreeNode;

public class Test543 {
    //力扣第543题 二叉树的直径 即 两节点最长路径的长度
    public static void main(String[] args) {


    }



    private static int ans = 1;

    //方法1 深度优先搜索 左子树深度最大值加上右子树深度最大值 -1 就是经过该节点的深度最大值 就是直径
    public static int diameterOfBinaryTree(TreeNode root) {
        deep(root);
        return ans;
    }

    //深度优先搜索递归函数
    public static int deep(TreeNode root) {
        //深度优先搜索
        if (root == null){
            return 1;
        }
        int leftLength = deep(root.left);
        int rightLength = deep(root.right);
        ans = Math.max(ans,leftLength+rightLength);
        return Math.max(leftLength,rightLength)+1;
    }

















}
