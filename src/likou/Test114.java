package likou;

import struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Test114 {



    // ��������չ����ǰ����������ڵ㶼����������
    public static void main(String[] args) {


    }


    //����ֵ
    //����1 �ݹ� ��������������� �����
    //�ݹ麯��
    public static void helper(TreeNode treeNode, List<TreeNode> list){
        if (treeNode == null){
            return;
        }
        //ǰ��������뼯�� ���������øü������������
        list.add(treeNode);
        helper(treeNode.left,list);
        helper(treeNode.right,list);
    }
    public static void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        helper(root,list);
        //�ع�root��
        for (int i = 0; i < list.size()-1; i++) {
            list.get(i).left = null;
            list.get(i).right = list.get(i+1);

        }


    }



























}
