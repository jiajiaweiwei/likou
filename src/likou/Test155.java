package likou;

public class Test155 {

    //���۵� 155�� ������Сջ
    public static void main(String[] args) {


    }

    Node stackI;
    //��ʼ����ջ����
    public void MinStack() {
        this.stackI = new Node();
    }

    //ѹջ
    public void push(int val) {
        int min =  Math.min(stackI.min,val);
        Node node = new Node(val, min);
        node.next = stackI ;
        stackI = node;
    }
    //ɾ��ջ��Ԫ�� ��ɾ��
    public void pop() {
        stackI = stackI.next;
    }
    //ȡ��ջ��Ԫ��
    public int top() {
        int temp = stackI.val;
        return temp;
    }
    //ȡջ����Сֵ
    public int getMin() {
        return stackI.min;
    }
    class Node{

        int val;
        int min;//ĳջ����СԪ��
        Node next;

        public Node() {
            min = Integer.MAX_VALUE;
        }
        public Node(int val, int min) {
            this.val = val;
            this.min = min;
        }

        public Node(Node next) {
            this.next = next;
        }
    }
}

