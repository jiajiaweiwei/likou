package likou;

import java.util.Arrays;

public class Test238 {




    //238. ��������������ĳ˻�
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        int[] ints = productExceptSelf1(nums);
        System.out.println(Arrays.toString(ints));


    }
    //�ص㣺˫ָ��ǰ׺�ͷ���
    public static int[] productExceptSelf(int[] nums) {
        //ǰ׺֮������
        int[] L = new int[nums.length];
        L[0] = 1;
        //��׺֮������
        int[] R = new int[nums.length];
        R[nums.length-1] = 1;
        //��ǰ׺����
        for (int i = 1;i<nums.length;i++){
            L[i] = nums[i-1]*L[i-1];
        }
        //���׺����
        for (int i = nums.length-2;i>=0;i--){
            R[i] = nums[i+1]*R[i+1];
        }
        //����ǰ׺��׺������Ҫ������
        int[] ints = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            ints[i] = L[i]*R[i];
        }

        return ints;
    }


    //�ص㣺˫ָ��ǰ׺�ͷ����Ż�
    //û�������������������´��ٿ�
    public static int[] productExceptSelf1(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        Arrays.fill(ans,1);
        int beforeSum=1;
        int afterSum=1;
        for(int i=0,j=n-1;i<n;i++,j--){
            ans[i]*=beforeSum;
            ans[j]*=afterSum;
            beforeSum*=nums[i];
            afterSum*=nums[j];
        }
        return ans;
    }



}
