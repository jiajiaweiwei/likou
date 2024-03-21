package likou;

import struct.TreeNode;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Test101 {
    /*
    * ���۵�101�⣬�Գƶ����� �ж�һ�����Ƿ�Գ�
    * ע������
    * */
    public static void main(String[] args) {

    }
    //����1 ʹ�õݹ� �ж����ǲ��ǵ�����
    public static boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }

    //�ݹ麯�� ˫ָ�뷨�������ƶ������෴ ȷ���жϵ�λ���ǶԳƵ�
    public static boolean check(TreeNode a,TreeNode b){
        //��Ϊ�� ����false
        if (a == null && b == null){
            return true;
        }
        //���ҽ���һ��Ϊ��
        if (a == null || b == null){
            return false;
        }
        //�ݹ� �ԳƶԱ�
        return a.val ==b.val && check(a.left,b.right) && check(a.right,b.left);
    }





















    //����2 ʹ�õ��� Ҳ����ʹ�ò�α������жϵĽڵ���ȡ�������ڵĽڵ��Ƿ����


































































    //��α��� �жϵ������������ǲ��ǶԳƶ�����
    public static boolean isSymmetricTest(TreeNode root) {
        //����������� �ڵ�����Ϊһ��
        if (Objects.isNull(root.left) && Objects.isNull(root.right)){
            return true;
        }
        //��α�������
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            //ÿһ��Ľڵ����
            int size = queue.size();
            while (size>0){
                //��ȡ���Ƴ���ͷԪ��
                TreeNode nodeFirst = queue.poll();
                //���ýڵ�����ҽڵ��������
                if (nodeFirst.left != null){
                    queue.offer(nodeFirst.left);
                }
                if (nodeFirst.right != null){
                    queue.offer(nodeFirst.right);
                }
                if ( !Objects.isNull(nodeFirst.left) && !Objects.isNull(nodeFirst.right)){
                    //���ж� �����ӽڵ� �Ƿ�Գ�
                    if (nodeFirst.left.val != nodeFirst.right.val){
                        return false;
                    }
                }
                size--;
            }
            //ѭ��
        }
        return true;
    }




}
