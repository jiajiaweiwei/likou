package likou;


import java.util.*;

public class Test739 {


    //力扣第739中等题 每日温度   （使用单调栈）
    public static void main(String[] args) {


    }


    //方法1 暴力法省略 方法2 使用单调栈
    //有问题
    public int[] dailyTemperatures1(int[] temperatures) {
        //返回结果
        int[] result = new int[temperatures.length];
        //初始化单调栈 ( 使用链表形式的 队列模拟栈 )
        Deque stack = new LinkedList<Integer>();
        //对数组进行一次遍历
        for (int i = 0; i < temperatures.length; i++) {
            //栈空 或 遍历元素小于栈顶元素 栈顶元素入栈
            if (stack.isEmpty() ){
                stack.push(i);
            } else if (temperatures[(int) stack.peek()] > temperatures[i]) {
                //栈非空 对比栈顶大小 栈顶元素大则不出栈
                stack.push(i);
            }else {
                //否则 栈顶元素小，依次出 栈 对比栈顶
                while (!stack.isEmpty()&&temperatures[(int)stack.peek()]<=temperatures[i] ){
                    result[(int)stack.peek()] = i - (int)stack.pop();
                }
                stack.push(i);
            }
        }
        return result;
    }

    //优化后
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < temperatures.length; i++) {
            //栈顶元素小，依次出 栈 对比栈顶
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            //否则入栈
            stack.push(i);
        }
        return result;
    }


}
