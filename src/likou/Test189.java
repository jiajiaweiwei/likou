package likou;

import java.util.Enumeration;

public class Test189 {


    public static void main(String[] args) {
        int[] nums = new int[]{1,2};
        rotate3(nums,0);
        for (int i :
             nums) {
            System.out.println("i = " + i);
        }
    }
    //189 �������ת��������
    //����һ��ʹ�ö��������
    //ʱ�临�Ӷ� n
    //�ռ临�Ӷ� n
    public static void rotate(int[] nums, int k) {
        //�����������
        if (nums.length<=1){
            return;
        }
        int l = nums.length;
        if (k>=nums.length){
            k = k % nums.length;
        }
        int temp = k;
        //�½�һ�����顣����Ҫ���kֵ��ѡ��λ����ת��ֵ
        int[] ints = new int[l];
        for (int i = 0;i<k;i++){
            ints[i] = nums[l-temp];
            temp--;
        }
        int temp2 = k;
        for (int i = 0;i<l-k;i++){// i = 0 1 2 3
            ints[temp2] = nums[i];    // k = 3 4 5 6
            temp2++;
        }
        System.arraycopy(ints, 0, nums, 0, ints.length);
    }
    //����������״�滻
    //ʱ�临�Ӷ� n
    //�ռ临�Ӷ� 1
    public static void rotate2(int[] nums, int k) {

    }
    //����3 ���鷭ת**�ص�
    //ʱ�临�Ӷ� n
    //�ռ临�Ӷ� 1
    public static void rotate3(int[] nums, int k) {
        //���⴦��
        if (nums.length<=1){
            return;
        }
        //ȡ��
        k = k % nums.length;
        //��һ��ȫ�̷�ת ��θ���
        //���巴ת����
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }
    //��һ��ȫ�̷�ת
    //���巴ת���� ��θ��� start��end����ʾ�����±�
    public static void reverse(int[] nums, int start, int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }

    //����4 ˫�˶���


}
