package likou;

import java.util.Arrays;

public class Test283 {
    public static void main(String[] args) {
        int[] nums = {1,2};
        test1(nums);
        System.out.println(Arrays.toString(nums));
    }
    //283�ƶ�0��˫ָ�룩
    public static void test(int[] nums){
        if (nums.length == 0){
            return;//��ǰ���ؽ�������
        }
        int i = 0;
        int j = 0;
        while (i<nums.length){
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        while (j<nums.length){
            nums[j] = 0;
            j++;
        }
    }
    //283�ƶ�0��˫ָ�룺�Ż���
    public static void test1(int[] nums){
        if (nums.length == 0){
            return;
        }
        int i =0,j = 0;
        while (i<nums.length){
            if (nums[i]!=0 ){
                if (i != j) {//����Ϊ�˱����һ������Ľ������������ж����
                    //�������ڶ����жϣ��ᵼ���Ժ���е�ѭ���������ж�һ�Σ����������������ٶ�
                    //1.������ǰ��ȫ������0ʱ�����Լӿ��ٶ�
                    //���ǣ�����������н϶�0�ģ��ʸ������ж������û��Ҫ��
                    // �ᵼ�¶�if��nums.length�Σ�ֻ�ٽ����˵�һ��
                    //�ܵ���˵�����ٶȽ�����
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
            i++;

        }





    }

}
