package likou;

import struct.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Test105 {



    //力扣第105中等题目 从前序遍历与中序遍历构造二叉树
    public static void main(String[] args) {



    }

    //根据前序遍历中序遍历的特点
    //前序遍历的最左节点一定是后序遍历的根节点
    //中序遍历的某节点的左序列是左子树 右序列是右子树
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return myBuildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private static Map<Integer, Integer> indexMap = new HashMap<>();

    public static TreeNode myBuildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        if (preorder_left > preorder_right) {
            return null;
        }

        // 根据前序遍历的最左边界确定根节点位置
        int inorder_root = indexMap.get(preorder[preorder_left]);
        TreeNode root = new TreeNode(preorder[preorder_left]);

        // 计算左子树节点个数
        int nodeLeftSize = inorder_root - inorder_left;

        // 递归构建左右子树
        root.left = myBuildTree(preorder, inorder, preorder_left + 1, preorder_left + nodeLeftSize, inorder_left, inorder_root - 1);
        root.right = myBuildTree(preorder, inorder, preorder_left + nodeLeftSize + 1, preorder_right, inorder_root + 1, inorder_right);

        return root;
    }

}
