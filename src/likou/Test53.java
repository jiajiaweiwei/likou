package likou;

public class Test53 {
    //��������
    public static void main(String[] args) {

        int[] nums = new int[]{5,4,-1,7,8};
        System.out.println(maxSubArray3(nums));


    }

    //����1��̰�ģ���̬�滮��
    public static int maxSubArray(int[] nums) {
        //�����������
        if (nums.length == 1){
            return nums[0];
        }
        //�������
        //̰���㷨����ÿһ���ж�Ѱ�����Ž⣬�Ӷ�����ȫ�����ŵ����
        //��ǰֵ
        //��
        int sum = 0;
        //���ֵ
        int max = nums[0];
        //�Ҿ߱����Ž�
        for (int temp:
             nums) {
            sum = Math.max(temp, sum + temp);
            max = Math.max(max,sum);
        }
        return max;
    }



    //����3�߶���(�ֶ���֮���߶����������ڷ�Χ��ѯ)
    //int[] nums = new int[]{5,4,-1,7,8};
    public static int maxSubArray2(int[] nums) {



        return 0;
    }

    //����4 ��Сǰ׺�ͣ�Ҳ���ڶ�̬�滮��
    public static int maxSubArray3(int[] nums) {
        int preMini = 0;
        int nowSum = 0;
        int max = nums[0];
        for (int temp:
             nums) {
            nowSum = temp + nowSum;//ǰ׺��
            max = Math.max((nowSum - preMini),max);
            preMini = Math.min(preMini,nowSum);//ά����Сǰ׺��

        }
        return max;
    }



















    /*public static int maxSubArray(int[] nums) {
        //�����������
        if (nums.length == 1){
            return nums[0];
        }
        //�������
        //̰���㷨����ÿһ���ж�Ѱ�����Ž⣬�Ӷ�����ȫ�����ŵ����
        int l = nums.length;
        int sumMax = nums[0];
        for (int temp:
             nums) {
            sumMax = Math.max(temp,sumMax);
        }
        int tempI = 0;
        for(int i = 0;i<l;i++){
            tempI = nums[i];
            for (int j = i+1;j<l;j++){
                tempI = tempI + nums[j];
                sumMax = Math.max(tempI,sumMax);
            }
        }
        return sumMax;
    }*/




}
