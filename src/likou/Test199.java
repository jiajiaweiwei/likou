package likou;

import struct.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test199 {


    //���۵�199�� ������������ͼ �Ӹ��ڵ㿪ʼ�������е����ҽڵ�
    public static void main(String[] args) {



    }


    //����1 ʹ��BFS ���ݲ���ȷ��ÿһ������ҽڵ�
    public static List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> integers = new ArrayList<>();
        //�����������
        if (root == null){
            return integers;
        }
        //���ؽ����
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            //ȷ��ÿһ�� ��ÿһ���Ԫ����� ����ȡ�ò������Ԫ��
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i== size-1){
                    //��ȡ����Ԫ��(�ò���������һ��Ԫ��)
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



    //����2 ʹ��DFS ���ݵݹ����ȷ�����ҽڵ�
    ArrayList<Integer> integers = new ArrayList<>();
    private  List<Integer> rightSideView2(TreeNode node){
        dfs(node,0);
        return integers;
    }

    private  void dfs(TreeNode node,int depth){
        //ʹ��depth�洢ÿһ��Ĳ�������ͨ����������ȷ�����ҽڵ�
        if (node ==null){
            return;
        }
        if (integers.size()<=depth){
            integers.add(node.val);//ȷ���ýڵ������ڸò�� ������������ұ� �����¸�ֵ
        }else {
            integers.set(depth, node.val);
        }
        dfs(node.left,depth+1);
        dfs(node.right,depth+1);
    }



















}
