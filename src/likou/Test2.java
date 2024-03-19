package likou;

import struct.ListNode;

public class Test2 {


    //力扣第二题，链表的两数之和
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,null);
        l1.next = new ListNode(4,null);
        l1.next.next = new ListNode(3,null);
        ListNode l2 = new ListNode(5,null);
        l2.next = new ListNode(6,null);
        l2.next.next = new ListNode(4,null);
        ListNode listNode = addTwoNumbers1(l1, l2);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }


    }




    //官方解法









    //有问题待修正
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //双指针法
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode result = new ListNode();
        ListNode temp = result;
        int sum = 0;
        int hight = 0;
        while (head1 != null || head2 != null){
            while (head1 == null && head2 != null ){
                temp.val = (head2.val + hight)%10 + hight;
                temp.next = new ListNode(0,null);
                temp = temp.next;
                head2 = head2.next;
                if (head2 == null){
                    break;
                }
            }
            while (head2 == null && head1 != null){
                temp.val = (head1.val + hight)%10 + hight ;
                temp.next = new ListNode(0,null);
                temp = temp.next;
                head1 = head1.next;
                if (head1 == null){
                    break;
                }
            }
            if (head1 != null && head2 != null){
                sum = (head1.val + head2.val)%10 ;
                temp.val = sum + hight;
                temp.next = new ListNode(0,null);
                temp = temp.next;
                hight = (head1.val + head2.val)/10;
                head1 = head1.next;
                head2 = head2.next;
            }

        }
        return result;
    }




    //完美解法，思路一样，代码也不冗余
    public static   ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode result = new ListNode();
        ListNode temp = result;
        int carry = 0;
        while (head1 != null || head2 != null || carry != 0) {
            int val1 = (head1 != null) ? head1.val : 0;
            int val2 = (head2 != null) ? head2.val : 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10; // 计算进位
            temp.next = new ListNode(sum % 10); // 当前位的值
            temp = temp.next;
            if (head1 != null) head1 = head1.next;
            if (head2 != null) head2 = head2.next;
        }
        return result.next; // 跳过头节点，返回结果链表的头部

    }


}
