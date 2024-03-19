package likou;

public class TestDP {

    //���Զ�̬�滮
    public static void main(String[] args) {
        System.out.println(testD(7));
        System.out.println(test2(7));
        System.out.println(test3(7));
    }
    //DP�����Լ����±�ĺ���

    //���ƹ�ʽ

    //������γ�ʼ��

    //����˳��

    //��ӡ����
    public static int testD(int n){
        //쳲��������� ��̬�滮����
        if (n<2){
            return n;
        }
        //����nֵ ��1��2��3��4��5��6��7��8 n��ʾ쳲���������Ԫ�ظ���
        //����ֵ  ��0��1��1��2��3��5��8��13
        int p = 0,q = 0,r = 1;
        //p��ʾdp[i-1] q��ʾdp[i-2] r��ʾdp[i-2]
        for (int i = 2;i<=n;i++){
            p = q;//0
            q = r;//1
            r = p+q;
        }
        return r;
    }
    //dp����
    public static int test2(int n){
        if (n<2){
            return n;
        }
        int[] dp = new int[30];
        dp[0] = 0;
        dp[1] = 1;
        for (int i =2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static int test3(int n){
        int i = 0;
        int j = 1;
        int k = 1;
        while (n>1){
            k = i+j;
            i=j;
            j=k;
            n--;
        }
        return k;
    }


}