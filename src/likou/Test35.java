package likou;

public class Test35 {

    //���۵�35�� ��������λ��

    /*
    * ����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ
    * �����������������Ŀ��ֵ�������������У�������
    * ���ᱻ��˳������λ�á������ʹ��ʱ�临�Ӷ�Ϊ O(log n) ���㷨��
    *
    * */

    public static void main(String[] args) {


    }



    //����1 ��������ԭ�����򣨿�ʹ�ö��ֲ��ң����ص�    ����ʱ�临�Ӷ�
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }


    //���ֲ���
    public static int test(int[] nums, int target){
        int length = nums.length;
        int left = 0;//��ָ��
        int right = length-1;//��ָ��
        int temp = length;
        //���ֲ����˳�������ָ������ʱ
        while (left<right){
            int  mid = (left+right)/2;
            if (nums[mid]>=target){
                temp = mid;
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return temp;


    }





}
