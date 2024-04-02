package likou;

import struct.ListNode;

public class Test19 {
    // 力扣第19题删除链表的第n个节点
    public static void main(String[] args) {



    }


    //删除链表的第n个节点
    //方法1 先遍历一遍获得节点长度length 再遍历到length - n的位置将其后缀元素置空
    //双指针法
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0); // 创建虚拟头节点，方便处理头节点的删除情况
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // 第一个指针先移动 n+1 步
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // 同时移动两个指针，直到第一个指针到达链表末尾
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // 删除第二个指针指向的节点
        second.next = second.next.next;

        return dummy.next; // 返回虚拟头节点的下一个节点作为新的头节点
    }

}
