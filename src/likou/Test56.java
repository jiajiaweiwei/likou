package likou;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Test56 {


    public static void main(String[] args) {


    }

    //56�⣬�ϲ�����
    //����������
    public  static int[][] merge(int[][] intervals) {

        //�Ƚ���ά������������
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        //Ȼ�󽫵�һ����������Ϊ��Ҫ��Ķ�ά�����Ԫ��
        //ʹ�����鼯�ϸ�����
        ArrayList<int[]> list = new ArrayList<>();
        //�Դ��жϺ�������
        for (int i = 0;i<intervals.length;i++){
            int L = intervals[i][0];
            int R = intervals[i][1];
            //����ϲ�����
            if ( list.size() == 0 || list.get(list.size() - 1)[1]<L){//�޷��ϲ�ʱ
                //ֱ�����
                list.add(new int[]{L,R});
            }else{//���Ժϲ�,�ϲ�����ǰ�������
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1],R);
            }
        }
        return list.toArray(new int[list.size()][]);
    }


}
