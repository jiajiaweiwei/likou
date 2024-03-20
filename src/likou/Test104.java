package likou;

import struct.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Test104 {



    //����104�⣬���������������
    //��������������ȱ���
    public static void main(String[] args) {


    }


    //����1 ʹ�õݹ� �����������
    //ʱ�临�Ӷ� n
    //�ռ临�Ӷ� ���ݵݹ麯������ջ ����� Ϊ height ����
    public static int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    //������Ԫ�������
    /*public int maxDepth(TreeNode root) {
        return root == null ?
                0 : Math.max(this.maxDepth(root.left), this.maxDepth(root.right)) + 1;
    }*/

    //������ ʹ�ö��� ��α���
    public static int maxDepth1(TreeNode root) {
        //�����������
        if (root == null){
            return 0;
        }
        //new һ������ ����ͷָ���βָ�������
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int temp = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            //ÿһ���size
            //��ÿһ������ֱ꣬��size=0
            while (size>0){
                //��ȡ���Ƴ���ͷԪ��
                TreeNode  node = queue.poll();
                //���ýڵ�����ҽڵ��������
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
                size--;
            }
            //��һ�������������߶ȼ�1
            temp++;

        }
        //�������ո߶�
        return temp;


    }

























}
