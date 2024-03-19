package likou;


import java.util.List;

/*
*
* 合并两个有序链表
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
        //双指针法
        ListNode node1 = list1;
        ListNode node2 = list2;
        //空的头节点
        ListNode head = new ListNode();
        //操作新链表的指针
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
        // 处理剩余节点
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
