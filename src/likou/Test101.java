package likou;

import struct.TreeNode;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Test101 {
    /*
    * 力扣第101题，对称二叉树 判断一棵树是否对称
    * 注意审题
    * */
    public static void main(String[] args) {

    }
    //方法1 使用递归 判断左是不是等于右
    public static boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }

    //递归函数 双指针法，左右移动方向相反 确保判断的位置是对称的
    public static boolean check(TreeNode a,TreeNode b){
        //都为空 返回false
        if (a == null && b == null){
            return true;
        }
        //有且仅有一个为空
        if (a == null || b == null){
            return false;
        }
        //递归 对称对比
        return a.val ==b.val && check(a.left,b.right) && check(a.right,b.left);
    }





















    //方法2 使用迭代 也就是使用层次遍历，判断的节点是取出的相邻的节点是否相等


































































    //层次遍历 判断的是树的字数是不是对称二叉树
    public static boolean isSymmetricTest(TreeNode root) {
        //特殊情况处理 节点至少为一个
        if (Objects.isNull(root.left) && Objects.isNull(root.right)){
            return true;
        }
        //层次遍历队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            //每一层的节点个数
            int size = queue.size();
            while (size>0){
                //获取并移除队头元素
                TreeNode nodeFirst = queue.poll();
                //将该节点的左右节点依次入队
                if (nodeFirst.left != null){
                    queue.offer(nodeFirst.left);
                }
                if (nodeFirst.right != null){
                    queue.offer(nodeFirst.right);
                }
                if ( !Objects.isNull(nodeFirst.left) && !Objects.isNull(nodeFirst.right)){
                    //再判断 左右子节点 是否对称
                    if (nodeFirst.left.val != nodeFirst.right.val){
                        return false;
                    }
                }
                size--;
            }
            //循环
        }
        return true;
    }




}
