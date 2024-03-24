package likou;

import struct.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class Test98 {

    //���۵�98�� ��֤����������
    public static void main(String[] args) {

    }




    //����1 ��������ͬ ʹ�õݹ�
    public static boolean isValidBST(TreeNode root) {
        //�ݹ�
        return isTrue(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    //�ݹ麯��
    public static boolean isTrue(TreeNode root,int lower ,int upper){
        //������
        if (root == null){
            return true;
        }
        //��������� ��Ϊ����������������
        if (root.val<=lower || root.val>=upper){
            return false;
        }
        //�ݹ�
        return isTrue(root.left,lower, root.val)&&isTrue(root.right, root.val, upper);
    }




    //����2 ������� �ж��������ǲ��ǵ���
    public static boolean isValidBST2(TreeNode root) {
        //�������˳�� �����
        //ʹ��ջ ����ȳ����ص�
        Deque<TreeNode> stack = new LinkedList<>();
        double inorder = -Double.MAX_VALUE;
        while (!stack.isEmpty()||root!=null){
            while(root!=null){
                stack.push(root);
                //����ڵ�ȫ����ջ
                root = root.left;
            }
            //�����ȫ����ջ�󣬺���ȳ� ����߳�ջ
            root = stack.pop();
            //�ж��Ƿ���϶���������
            if (root.val<=inorder){
                return false;
            }
            inorder = root.val;
            root = root.right;
        }
        return true;

    }

    //����3 ʹ�õݹ�ʵ��   DFS������� ���ж��Ƿ�Ϊ����������
    public static boolean inorderTraversal(){

        return true;
    }






}
