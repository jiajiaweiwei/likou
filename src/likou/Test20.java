package likou;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Test20 {


    //��20�� ���� ��Ч������
    public static void main(String[] args) {

        String s = "()(){}";
        String[] string = s.split("");
        //ֱ����charAt()
        System.out.println(s.charAt(0));


        System.out.println(string[0]);

    }


    //ʹ��ջ
    public boolean isValid(String s) {
        //����������� ���ŵĸ���������ż���ſ���ƥ��
        if (s.length()%2 == 1){
            return false;
        }
        //stack.peek()�û���ȡջ��Ԫ�ض����Ƴ���
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //�ж��Ƿ�Ϊ������
            if (map.containsValue(c)){
                //�������� ��Ա�ջ��Ԫ���Ƿ�ƥ��
                // ջΪ�� ����ջ�����Ų�ƥ�䣬 ��˵�����ַ���ƥ��ʧ�� ����false
                if (stack.isEmpty() || map.get(stack.pop()) != c){
                    return false;
                }
            }else {
                //����������ջ
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
