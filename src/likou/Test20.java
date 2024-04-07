package likou;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Test20 {


    //第20题 简单题 有效的括号
    public static void main(String[] args) {

        String s = "()(){}";
        String[] string = s.split("");
        //直接用charAt()
        System.out.println(s.charAt(0));


        System.out.println(string[0]);

    }


    //使用栈
    public boolean isValid(String s) {
        //特殊情况处理 括号的个数必须是偶数才可能匹配
        if (s.length()%2 == 1){
            return false;
        }
        //stack.peek()用户获取栈顶元素而不移除它
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //判断是否为右括号
            if (map.containsValue(c)){
                //是右括号 则对比栈顶元素是否匹配
                // 栈为空 或者栈顶括号不匹配， 则说明该字符串匹配失败 返回false
                if (stack.isEmpty() || map.get(stack.pop()) != c){
                    return false;
                }
            }else {
                //左括号则入栈
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
