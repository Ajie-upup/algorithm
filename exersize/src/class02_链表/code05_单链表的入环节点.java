package class02_链表;

/**
 * @Author: ajie
 * @Date: 2022/11/19
 */
public class code05_单链表的入环节点 {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                //有环
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
//                return slow;
            }
        }
//        return null;
    }
}
