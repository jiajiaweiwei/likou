package likou;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Test141 {



    //��������
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



    //�ⷨһ����ϣ������ȽϷ�,ȱ�㣬ʱ�临�Ӷȿռ临�Ӷȶ��Ƚϸ�
    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<ListNode>();
        //Ҳ������!seen.add(head)
        //��ʾ�����Ԫ�أ�����Ѿ����ˣ������ʧ�ܷ���false���ӣ�ȡ������true
        while (head!=null){
           if (hashSet.contains(head)){
               return true;
           }
           hashSet.add(head);
           head = head.next;
        }
        return false;
    }


    //����2 ����ָ��
    //�����ڹ������ܣ�һ����ĺ�һ�����ģ���һ���������ܻ�����
    //������ǻᳬ�����ģ�ֻ�ܿ�һ��������˻��������ģ�
    public static boolean hasCycle2(ListNode head) {

        //�����������
        if(head == null || head.next == null || head.next.next==null){
            return false;
        }
        //��ָ�� ����ָ�룬�ٶȲ�����Ե���
        ListNode fast = head.next.next;
        //��ָ��
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
