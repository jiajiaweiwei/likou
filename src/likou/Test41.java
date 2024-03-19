package likou;

import java.util.Arrays;

public class Test41 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,2,2,1,1};
        System.out.println(firstMissingPositive(nums));
    }
    //���������Ż��ܰٷ�13
    /*
    * ���������ʱ�临�Ӷ�Ϊ O(nlogn)����Ҫ�������������ġ�
    * �ռ临�Ӷ�Ϊ O(1)��ֻʹ���˳������Ķ���ռ䡣
�����ʱ�临�Ӷ�Ϊ O(nlogn)�����������ʱ�临�Ӷ�Ϊ O(n)��
* ����ܵ�ʱ�临�Ӷ�Ϊ O(nlogn+n) = O(nlogn)���ڿռ临�Ӷ��ϣ�
* ��û��ʹ�ö��������򼯺ϣ�ֻʹ���˳���������ʱ��������˿ռ临�Ӷ�Ϊ O(1)��
    * */
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int temp = 1;
        if (nums.length<=1){
            temp = 0;
        }
        for (int j = 0;j<nums.length;j++){
            if (nums[j] > 0){
                temp = j;
                break;
            }
        }
        if (nums[temp]!=1){
            return 1;
        }
        while (temp<nums.length-1 && (nums[temp+1] == (nums[temp]+1) ||nums[temp+1] == nums[temp] ) ){
            temp++;
        }
        return nums[temp]+1;
    }
}
