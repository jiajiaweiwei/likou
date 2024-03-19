package likou;

import java.util.ArrayList;
import java.util.List;

public class Test234 {
    public static void main(String[] args) {


        ListNode node2 = new ListNode(1, null);
        ListNode node1 = new ListNode(2, node2);
        ListNode node0 = new ListNode(2, node1);
        ListNode head = new ListNode(1, node0);
        System.out.println(isPalindrome1(head));


    }


    //��������




    
    //����һ ʹ����ѧ����
    //ע�⣬����Ļ������Ǵ�1��ʼ�ģ�Ҳ��������ĵ�һ��Ԫ�ص�ֵһ����1��
    //��ô������ǻ�������Ļ���˵����������һ��Ҳһ����һ���ɴ�����
    //�����ǶԶԳƵ�
    //һ�α������õ�������Ĵ��ͷ���
    //���������жϴ��ͷ����Ƿ���ȣ������˵���ǻ��Ĵ�
    //ȱ�����������ڵ��Ļ������ܺķѿռ�ϴ�
    public static boolean isPalindrome1(ListNode head) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        //ʹ��StringBulider
        while(head != null) {
            s1.append(head.val);
            s2.insert(0,head.val);
            head = head.next;
        }
        return s1.toString().equals(s2.toString());
    };


    // ����������ֵ���Ƶ������к���˫ָ�뷨




    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static boolean isPalindrome2(ListNode head) {
        List<Integer> vals = new ArrayList<Integer>();

        // �������ֵ���Ƶ�������
        ListNode currentNode = head;
        while (currentNode != null) {
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        // ʹ��˫ָ���ж��Ƿ����
        int front = 0;
        int back = vals.size() - 1;
        while (front < back) {
            if (!vals.get(front).equals(vals.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }





}
