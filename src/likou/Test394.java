package likou;

import java.util.LinkedList;
import java.util.Stack;

public class Test394 {


    //力扣 394中等题 字符串编码
    //有点类似括号匹配
    public static void main(String[] args) {



    }


    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ']') {
                StringBuilder temp = new StringBuilder();
                while (stack.peek() != '[') {
                    temp.insert(0, stack.pop());
                }
                stack.pop(); // 弹出左括号 '['

                StringBuilder countStr = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    countStr.insert(0, stack.pop());
                }
                int repeatCount = Integer.parseInt(countStr.toString());
                String repeated = temp.toString().repeat(repeatCount);
                for (char ch : repeated.toCharArray()) {
                    stack.push(ch);
                }
            } else {
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }

}
