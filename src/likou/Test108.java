package likou;

import struct.TreeNode;

public class Test108 {


    //���۵�108�� �� �������飨�����������У� ת����  ƽ�����������
    public static void main(String[] args) {



    }




    //����1 ʹ�õݹ� (��ȷ�����ڵ�)  ��ȷ���������� ���������ĵ����ⶼ��һ���� �ʲ��õݹ��˼��  ��Ϊ�����ⶼ��һ����
    public static TreeNode sortedArrayToBST(int[] nums) {
        //ƽ������������ص�
        //��С˳��Ϊ ��<��<�� ƽ�������������������Ǹ���������
        return sortArrayTOToBST(nums, 0, nums.length - 1);
    }

    //�ݹ麯�� �����������������������������
    //����ת��Ϊ ��������������������������Ƿ����Ψһ��ȷ������������
    public static TreeNode sortArrayTOToBST(int[] nums,int left,int right){
        if (left > right){
            return null;
        }
        //���ϵ�ȷ�����ڵ�
        int mid = (left+right)/2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = sortArrayTOToBST(nums,left,mid-1);
        treeNode.right = sortArrayTOToBST(nums,mid+1,right);
        return treeNode;
    }




}
