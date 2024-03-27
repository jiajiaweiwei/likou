package likou;

import struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Test114 {



    // 将二叉树展开成前序遍历链表，节点都在右子树上
    public static void main(String[] args) {


    }


    //返回值
    //方法1 递归 二叉树的先序遍历 左根右
    //递归函数
    public static void helper(TreeNode treeNode, List<TreeNode> list){
        if (treeNode == null){
            return;
        }
        //前序遍历加入集合 后期再利用该集合重组二叉树
        list.add(treeNode);
        helper(treeNode.left,list);
        helper(treeNode.right,list);
    }
    public static void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        helper(root,list);
        //重构root树
        for (int i = 0; i < list.size()-1; i++) {
            list.get(i).left = null;
            list.get(i).right = list.get(i+1);

        }


    }



























}
