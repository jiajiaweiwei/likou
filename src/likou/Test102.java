package likou;

import struct.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test102 {


    //力扣第102题，二叉树的层序遍历
    public static void main(String[] args) {



    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        //特殊情况处理
        if (root == null){
            return new ArrayList<>();
        }
        //层序遍历队列
        Queue<TreeNode> queue = new LinkedList<>();
        //节点数据
        List<List<Integer>> lists = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> integers = new ArrayList<>();
            int size = queue.size();
            //取出队头元素出队并
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                integers.add(node.val);
                //将子节点入队
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



    //方法2 递归
    static List<List<Integer>> levels = new ArrayList<List<Integer>>();
    public static List<List<Integer>> levelOrder1(TreeNode root) {
        //特殊情况处理
        if (root == null)return levels;
        helper(root,0);
        return levels;
    }

    //要返回的结果
    //使用深度优先遍历依次将最左边的节点加入到数组对应的层中
    public static void   helper(TreeNode node ,int level){
        if (levels.size() == level) levels.add(new ArrayList<Integer>());
        //在对应的层的链表位置插入对应的元素
        levels.get(level).add(node.val);
        //向下递归
        if (node.left != null) helper(node.left,level+1);
        if (node.right != null) helper(node.right,level+1);
    }



}
