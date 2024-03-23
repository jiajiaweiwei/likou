package likou;

import struct.TreeNode;

public class Test108 {


    //力扣第108题 将 有序数组（按照升序排列） 转化成  平衡二叉搜索树
    public static void main(String[] args) {



    }




    //方法1 使用递归 (先确定根节点)  再确定左右子树 左右子树的的问题都是一样的 故采用递归的思想  因为子问题都是一样的
    public static TreeNode sortedArrayToBST(int[] nums) {
        //平衡二叉搜索树特点
        //大小顺序为 左<根<右 平衡二叉数的中序遍历就是该数组序列
        return sortArrayTOToBST(nums, 0, nums.length - 1);
    }

    //递归函数 二叉搜索树的中序遍历是升序序列
    //问题转化为 给定二叉搜索树的中序遍历，是否可以唯一地确定二叉搜索树
    public static TreeNode sortArrayTOToBST(int[] nums,int left,int right){
        if (left > right){
            return null;
        }
        //不断地确定根节点
        int mid = (left+right)/2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = sortArrayTOToBST(nums,left,mid-1);
        treeNode.right = sortArrayTOToBST(nums,mid+1,right);
        return treeNode;
    }




}
