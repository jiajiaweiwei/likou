package likou;

import struct.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;

public class Test236 {

    public static void main(String[] args) {



    }



    public HashMap<Integer, TreeNode> hashMap = new HashMap<>();
    //方法2 使用哈希表记录父节点
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<Integer> treeNodes = new ArrayList<>();
        //深度优先遍历构建哈希表
        dfs(root);
        while (p!=null){
            //利用哈希表从P节点开始向上访问并记录路径 (如何向上访问)
            treeNodes.add(p.val);
            p = hashMap.get(p.val);//获取父节点
        }
        //遍历q的父节点，找到第一个出现在list中的节点 就是最近的公共父节点
        while (q!=null){
            if (treeNodes.contains(q.val)){
                return q;
            }
            q = hashMap.get(q.val);
        }
        //如果没找到，则返回空
        return null;
    }
    //用哈希表记录每个节点的父指针节点 键为节点的数据
    public void dfs(TreeNode root){
        if (root==null){
            return;
        }
        //记录 某节点的 父节点
        if (root.left!=null){
            hashMap.put(root.left.val,root);
            dfs(root.left);
        }
        if (root.right!=null){
            hashMap.put(root.right.val,root);
            dfs(root.right);
        }
    }





}
