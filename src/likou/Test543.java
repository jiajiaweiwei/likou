package likou;

import struct.TreeNode;

public class Test543 {
    //���۵�543�� ��������ֱ�� �� ���ڵ��·���ĳ���
    public static void main(String[] args) {


    }



    private static int ans = 1;

    //����1 ����������� ������������ֵ����������������ֵ -1 ���Ǿ����ýڵ��������ֵ ����ֱ��
    public static int diameterOfBinaryTree(TreeNode root) {
        deep(root);
        return ans;
    }

    //������������ݹ麯��
    public static int deep(TreeNode root) {
        //�����������
        if (root == null){
            return 1;
        }
        int leftLength = deep(root.left);
        int rightLength = deep(root.right);
        ans = Math.max(ans,leftLength+rightLength);
        return Math.max(leftLength,rightLength)+1;
    }

















}
