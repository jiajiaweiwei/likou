package likou;

import struct.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test102 {


    //���۵�102�⣬�������Ĳ������
    public static void main(String[] args) {



    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        //�����������
        if (root == null){
            return new ArrayList<>();
        }
        //�����������
        Queue<TreeNode> queue = new LinkedList<>();
        //�ڵ�����
        List<List<Integer>> lists = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> integers = new ArrayList<>();
            int size = queue.size();
            //ȡ����ͷԪ�س��Ӳ�
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                integers.add(node.val);
                //���ӽڵ����
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }
            lists.add(integers);
        }

        return lists;
    }



    //����2 �ݹ�
    static List<List<Integer>> levels = new ArrayList<List<Integer>>();
    public static List<List<Integer>> levelOrder1(TreeNode root) {
        //�����������
        if (root == null)return levels;
        helper(root,0);
        return levels;
    }

    //Ҫ���صĽ��
    //ʹ��������ȱ������ν�����ߵĽڵ���뵽�����Ӧ�Ĳ���
    public static void   helper(TreeNode node ,int level){
        if (levels.size() == level) levels.add(new ArrayList<Integer>());
        //�ڶ�Ӧ�Ĳ������λ�ò����Ӧ��Ԫ��
        levels.get(level).add(node.val);
        //���µݹ�
        if (node.left != null) helper(node.left,level+1);
        if (node.right != null) helper(node.right,level+1);
    }



}
