package likou;

import struct.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Test226 {

    //������Ŀ�� ��ת������
    public static void main(String[] args) {



    }


    //����1 ʹ�ö������Ĳ�α��� ���ν������ҽڵ��val
    public static TreeNode invertTree(TreeNode root) {
        //�����������
        if (root == null){
            return root;
        }
        //����1 ��α���ʹ�ö��� queue ͨ��ʹ�ö��У��൱��ʹ���˺����ݹ����ջ
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode temp = null;
        //���ڵ����
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size>0){
                //��ȡ���Ƴ���ͷԪ��
                TreeNode  node = queue.poll();
                //����ͷ�������ӽڵ����
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
                //������ͷԪ����ڵ���ҽڵ��λ��
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

    //����2 ʹ�õݹ��˼��
    public static TreeNode invertTree1(TreeNode root) {
        //�����������
        if (root == null){
            return root;
        }
        //����1 ʹ�õݹ��˼��
        TreeNode left = invertTree1(root.left);
        TreeNode right = invertTree1(root.right);
        root.left = right;
        root.right = left;
        return root;
    }


}
