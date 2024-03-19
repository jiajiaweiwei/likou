package likou;

import java.util.HashSet;

public class Test128 {

    //���۵�128�� �����������
    public static void main(String[] args) {
        int[] nums ={0,3,7,2,5,8,4,6,0,1};
        System.out.println("�������Ϊ"+longestConsecutive(nums)+"��Ԫ��");

    }
    /*
    * ����һ��δ������������� nums ��
    * �ҳ���������������У���Ҫ������Ԫ����ԭ�������������ĳ��ȡ�
    * ������Ʋ�ʵ��ʱ�临�Ӷ�Ϊ O(n) ���㷨��������⡣
    * */

    public static int longestConsecutive(int[] nums){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num:
             nums) {
            hashSet.add(num);
        }
        int est = 0;
        for (int num:
             hashSet) {
            if (!hashSet.contains(num-1)){
                int temp = num;
                while(hashSet.contains(temp+1)){
                    temp++;
                }
                est = Math.max(est,temp-num+1);
            }
        }
        return est;

    }
}
