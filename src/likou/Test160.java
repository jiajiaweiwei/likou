package likou;

public class Test160 {
    //��106�� �ཻ��
    public static void main(String[] args) {

        ListNode listAll1 = new ListNode(8);
        ListNode listAll2 = new ListNode(4);
        ListNode listAll3 = new ListNode(5);


        //A��˽��
        ListNode listA = new ListNode(0);
        ListNode listA1 = new ListNode(4);
        ListNode listA2 = new ListNode(1);
        listA.next = listA1;
        listA1.next = listA2;


        //B��˽��
        ListNode listB = new ListNode(0);
        ListNode listB1 = new ListNode(5);
        ListNode listB2 = new ListNode(6);
        ListNode listB3 = new ListNode(1);
        listB.next = listB1;
        listB1.next = listB2;
        listB2.next = listB3;

        //��������

        listA2.next = listAll1;
        listB3.next = listAll1;
        listAll1.next = listAll2;
        listAll2.next = listAll3;
        listAll3.next = null;


        //��ʼ����
        ListNode intersectionNode = getIntersectionNode(listA, listB);
        System.out.println("intersectionNode.val = " + intersectionNode.val);


    }


     public static class ListNode {
        int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
    }

    //˫ָ�뷨
    //������A-B��B-A��������ͬ������
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //�����������
        ListNode nextTempA = headA.next;
        ListNode nextTempB = headB.next;
        while (nextTempA != nextTempB ){
            nextTempA = nextTempA == null ? headB : nextTempA.next;
            nextTempB = nextTempB == null ? headA : nextTempB.next;
        }
        return nextTempA;
    }







}
