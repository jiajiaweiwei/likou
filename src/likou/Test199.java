package likou;

import struct.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test199 {


    //力扣第199题 二叉树的右视图 从根节点开始返回所有的最右节点
    public static void main(String[] args) {



    }


    //方法1 使用BFS 根据层数确定每一层的最右节点
    public static List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> integers = new ArrayList<>();
        //特殊情况处理
        if (root == null){
            return integers;
        }
        //返回结果集
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            //确定每一层 把每一层的元素入队 并获取该层的最右元素
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i== size-1){
                    //获取最右元素(该层遍历的最后一个元素)
                    integers.add(node.val);
                }
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
            }
        }
        return integers;
    }



    //方法2 使用DFS 根据递归深度确定最右节点
    ArrayList<Integer> integers = new ArrayList<>();
    private  List<Integer> rightSideView2(TreeNode node){
        dfs(node,0);
        return integers;
    }

    private  void dfs(TreeNode node,int depth){
        //使用depth存储每一层的层数，并通过层数可以确定最右节点
        if (node ==null){
            return;
        }
        if (integers.size()<=depth){
            integers.add(node.val);//确定该节点是属于该层的 最后会遍历到最右边 当重新赋值
        }else {
            integers.set(depth, node.val);
        }
        dfs(node.left,depth+1);
        dfs(node.right,depth+1);
    }



















}
