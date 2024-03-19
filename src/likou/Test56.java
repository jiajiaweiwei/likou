package likou;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Test56 {


    public static void main(String[] args) {


    }

    //56题，合并区间
    //方法：排序
    public  static int[][] merge(int[][] intervals) {

        //先将二维数组升序排列
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        //然后将第一个数组设置为所要求的二维数组的元素
        //使用数组集合更方便
        ArrayList<int[]> list = new ArrayList<>();
        //以此判断后序数组
        for (int i = 0;i<intervals.length;i++){
            int L = intervals[i][0];
            int R = intervals[i][1];
            //数组合并条件
            if ( list.size() == 0 || list.get(list.size() - 1)[1]<L){//无法合并时
                //直接添加
                list.add(new int[]{L,R});
            }else{//可以合并,合并覆盖前面的数组
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1],R);
            }
        }
        return list.toArray(new int[list.size()][]);
    }


}
