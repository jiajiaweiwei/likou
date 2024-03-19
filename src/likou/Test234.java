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


    //回文链表




    
    //方法一 使用数学方法
    //注意，这里的回文数是从1开始的，也就是链表的第一个元素的值一定是1，
    //那么，如果是回文链表的话，说明链表的最后一个也一定是一，由此类推
    //链表是对对称的
    //一次遍历，得到该链表的串和反串
    //遍历结束判断串和反串是否相等，相等则说明是回文串
    //缺点是如果链表节点多的话，可能耗费空间较大
    public static boolean isPalindrome1(ListNode head) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        //使用StringBulider
        while(head != null) {
            s1.append(head.val);
            s2.insert(0,head.val);
            head = head.next;
        }
        return s1.toString().equals(s2.toString());
    };


    // 方法二，将值复制到数组中后用双指针法




    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static boolean isPalindrome2(ListNode head) {
        List<Integer> vals = new ArrayList<Integer>();

        // 将链表的值复制到数组中
        ListNode currentNode = head;
        while (currentNode != null) {
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        // 使用双指针判断是否回文
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
