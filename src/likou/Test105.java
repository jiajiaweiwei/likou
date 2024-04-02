package likou;

import struct.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Test105 {



    //���۵�105�е���Ŀ ��ǰ�����������������������
    public static void main(String[] args) {



    }

    //����ǰ���������������ص�
    //ǰ�����������ڵ�һ���Ǻ�������ĸ��ڵ�
    //���������ĳ�ڵ���������������� ��������������
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

        // ����ǰ�����������߽�ȷ�����ڵ�λ��
        int inorder_root = indexMap.get(preorder[preorder_left]);
        TreeNode root = new TreeNode(preorder[preorder_left]);

        // �����������ڵ����
        int nodeLeftSize = inorder_root - inorder_left;

        // �ݹ鹹����������
        root.left = myBuildTree(preorder, inorder, preorder_left + 1, preorder_left + nodeLeftSize, inorder_left, inorder_root - 1);
        root.right = myBuildTree(preorder, inorder, preorder_left + nodeLeftSize + 1, preorder_right, inorder_root + 1, inorder_right);

        return root;
    }

}
