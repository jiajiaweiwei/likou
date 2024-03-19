package likou;

public class Test206 {
    public static void main(String[] args) {

    }



     public static class ListNode {
          int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


    public static ListNode reverseList(ListNode head) {
        // �����������
        if (head == null) {
            return null;
        }
        // ��ʱǰ��ڵ�
        ListNode tempBefore = null,tempAfter = null;
        ListNode nodeFirst = head;  // ��һ���ڵ�
        while (nodeFirst != null) {
            tempAfter = nodeFirst.next;  // ��ʱ��ȡ��ڵ�
            nodeFirst.next = tempBefore; // ��ת����
            tempBefore = nodeFirst;
            nodeFirst = tempAfter;       // ѭ��
        }
        return tempBefore;
    }






}
