package likou;

public class Test155 {

    //力扣第 155题 构建最小栈
    public static void main(String[] args) {


    }

    Node stackI;
    //初始化堆栈对象
    public void MinStack() {
        this.stackI = new Node();
    }

    //压栈
    public void push(int val) {
        int min =  Math.min(stackI.min,val);
        Node node = new Node(val, min);
        node.next = stackI ;
        stackI = node;
    }
    //删除栈顶元素 不删除
    public void pop() {
        stackI = stackI.next;
    }
    //取出栈顶元素
    public int top() {
        int temp = stackI.val;
        return temp;
    }
    //取栈的最小值
    public int getMin() {
        return stackI.min;
    }
    class Node{

        int val;
        int min;//某栈的最小元素
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

