package likou;


import java.util.List;

/*
*
* �ϲ�������������
* */
public class Test21 {
    public static void main(String[] args) {



    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }



    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //˫ָ�뷨
        ListNode node1 = list1;
        ListNode node2 = list2;
        //�յ�ͷ�ڵ�
        ListNode head = new ListNode();
        //�����������ָ��
        ListNode temp = head;
        while (node1 != null && node2 != null ){
            if (node1.val <= node2.val){
                temp.next = node1;
                node1 = node1.next;
            }else {
                temp.next = node2;
                node2 = node2.next;
            }
            temp = temp.next;
        }
        // ����ʣ��ڵ�
        if (node1 != null) {
            temp.next = node1;
            temp = temp.next;
        }
        if (node2 != null) {
            temp.next = node2;
            temp = temp.next;
        }


        return head.next;
    }






}
