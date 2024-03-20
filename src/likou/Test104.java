package likou;

import struct.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Test104 {



    //力扣104题，求二叉树的最大深度
    //二叉树的深度优先遍历
    public static void main(String[] args) {


    }


    //方法1 使用递归 深度优先搜索
    //时间复杂度 n
    //空间复杂度 根据递归函数调用栈 的深度 为 height 树高
    public static int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    //可用三元运算符简化
    /*public int maxDepth(TreeNode root) {
        return root == null ?
                0 : Math.max(this.maxDepth(root.left), this.maxDepth(root.right)) + 1;
    }*/

    //方法二 使用队列 层次遍历
    public static int maxDepth1(TreeNode root) {
        //特殊情况处理
        if (root == null){
            return 0;
        }
        //new 一个队列 （带头指针和尾指针的链表）
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int temp = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            //每一层的size
            //把每一层的入完，直到size=0
            while (size>0){
                //获取并移除队头元素
                TreeNode  node = queue.poll();
                //将该节点的左右节点依次入队
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
                size--;
            }
            //在一层遍历结束后给高度加1
            temp++;

        }
        //返回最终高度
        return temp;


    }

























}
