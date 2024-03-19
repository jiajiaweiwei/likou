package likou;

import java.util.HashSet;
import java.util.LinkedList;

public class Test142 {



    //第142题，环形链表2
    public static void main(String[] args) {



    }


    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }





    //方法1，利用HashSet
    public static ListNode detectCycle(ListNode head) {
        HashSet<ListNode> listNodes = new HashSet<>();
        while (head != null){
            if (!listNodes.contains(head)){
                listNodes.add(head);
            }else {
                return head;
            }
            head = head.next;
        }
        return null;
    }


    //方法2,快慢指针
    public static ListNode detectCycle2(ListNode head) {
        //特殊情况处理
        if (head == null || head.next ==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode temp = head;
                while (temp != slow) {
                    temp = temp.next;
                    slow = slow.next;
                }
                return temp;
            }

        }
        return null;

    }


















}
