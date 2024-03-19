package likou;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Test141 {



    //环形链表
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



    //解法一：哈希表遍历比较法,缺点，时间复杂度空间复杂度都比较高
    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<ListNode>();
        //也可以用!seen.add(head)
        //表示先添加元素，如果已经有了，会添加失败返回false，加！取反返回true
        while (head!=null){
           if (hashSet.contains(head)){
               return true;
           }
           hashSet.add(head);
           head = head.next;
        }
        return false;
    }


    //方法2 快慢指针
    //类似于龟兔赛跑，一个快的和一个慢的，在一个环中跑总会相遇
    //快的总是会超过慢的（只能快一步，快多了会跳过慢的）
    public static boolean hasCycle2(ListNode head) {

        //特殊情况处理
        if(head == null || head.next == null || head.next.next==null){
            return false;
        }
        //快指针 快满指针，速度差异可以调节
        ListNode fast = head.next.next;
        //慢指针
        ListNode slow = head;
        while (fast!=slow){
            if(fast == null || fast.next == null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }


















}
