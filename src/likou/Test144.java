package likou;

import struct.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Test144 {
    //��������ǰ�����
    public static void main(String[] args) {


    }




    //ʹ�õݹ�ʵ�ֶ�������ǰ�����
    public static List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<Integer> integers = new LinkedList<>();
        helper(root,integers);
        return  integers;
    }
    //�ݹ麯��
    public static void helper(TreeNode root,List<Integer> integers){
        if (root == null){
            return;
        }
        integers.add(root.val);
        helper(root.left,integers);
        helper(root.right,integers);
    }
}
