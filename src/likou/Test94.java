package likou;

import struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Test94 {



    //���������������
    public static void main(String[] args) {





    }





    public static List<Integer> inorderTraversal(TreeNode root) {
        //���ص������������
        List<Integer> integers = new ArrayList<>();
        //��������������
        //�ݹ�
        inorder(root,integers);
        return integers;
    }
    public static void inorder(TreeNode node,List<Integer> integers){
        if (node == null){
            return;
        }
        inorder(node.left,integers);
        integers.add(node.val);
        inorder(node.right,integers);
    }



}
