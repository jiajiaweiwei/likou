package likou;

import struct.ListNode;

public class Test19 {
    // ���۵�19��ɾ������ĵ�n���ڵ�
    public static void main(String[] args) {



    }


    //ɾ������ĵ�n���ڵ�
    //����1 �ȱ���һ���ýڵ㳤��length �ٱ�����length - n��λ�ý����׺Ԫ���ÿ�
    //˫ָ�뷨
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0); // ��������ͷ�ڵ㣬���㴦��ͷ�ڵ��ɾ�����
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // ��һ��ָ�����ƶ� n+1 ��
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // ͬʱ�ƶ�����ָ�룬ֱ����һ��ָ�뵽������ĩβ
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // ɾ���ڶ���ָ��ָ��Ľڵ�
        second.next = second.next.next;

        return dummy.next; // ��������ͷ�ڵ����һ���ڵ���Ϊ�µ�ͷ�ڵ�
    }

}
