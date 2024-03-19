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
        // 特殊情况处理
        if (head == null) {
            return null;
        }
        // 临时前后节点
        ListNode tempBefore = null,tempAfter = null;
        ListNode nodeFirst = head;  // 第一个节点
        while (nodeFirst != null) {
            tempAfter = nodeFirst.next;  // 临时获取后节点
            nodeFirst.next = tempBefore; // 反转方向
            tempBefore = nodeFirst;
            nodeFirst = tempAfter;       // 循环
        }
        return tempBefore;
    }






}
