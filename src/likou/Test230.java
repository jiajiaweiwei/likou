package likou;

import struct.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Test230 {

    //���۵�230�� ������������е�kС��ֵ
    public static void main(String[] args) {




    }



    //������������е�kС��ֵ
    //����1 ��������������������
    public static int kthSmallest(TreeNode root, int k) {
        //ʹ��ջʵ���������
        Stack<TreeNode> stack = new Stack<>();
        //�洢������λ��
        int i = 0;
        int temp = 0;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            //��ڵ��������
            if (!stack.isEmpty()){
                //��ջ����ջ
                TreeNode pop = stack.pop();
                temp = pop.val;
                i++;
                if (i == k) {
                    return temp;
                }
                //�����ҽڵ�
                if (pop.right!=null){
                    root = pop.right;
                }

            }

        }
        return temp;
    }

    //������������е�kС��ֵ
    //����2 ������ȱ����ݹ�
    public static int kthSmallest2(TreeNode root, int k) {




        return 0;
    }
}
