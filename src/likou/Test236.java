package likou;

import struct.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;

public class Test236 {

    public static void main(String[] args) {



    }



    public HashMap<Integer, TreeNode> hashMap = new HashMap<>();
    //����2 ʹ�ù�ϣ���¼���ڵ�
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<Integer> treeNodes = new ArrayList<>();
        //������ȱ���������ϣ��
        dfs(root);
        while (p!=null){
            //���ù�ϣ���P�ڵ㿪ʼ���Ϸ��ʲ���¼·�� (������Ϸ���)
            treeNodes.add(p.val);
            p = hashMap.get(p.val);//��ȡ���ڵ�
        }
        //����q�ĸ��ڵ㣬�ҵ���һ��������list�еĽڵ� ��������Ĺ������ڵ�
        while (q!=null){
            if (treeNodes.contains(q.val)){
                return q;
            }
            q = hashMap.get(q.val);
        }
        //���û�ҵ����򷵻ؿ�
        return null;
    }
    //�ù�ϣ���¼ÿ���ڵ�ĸ�ָ��ڵ� ��Ϊ�ڵ������
    public void dfs(TreeNode root){
        if (root==null){
            return;
        }
        //��¼ ĳ�ڵ�� ���ڵ�
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
