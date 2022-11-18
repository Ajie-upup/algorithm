package class02_链表;

/**
 * @Author: ajie
 * @Date: 2022/11/18
 */
public class code03_删除链表中的倒数第n个元素 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        int n = 1;
        ListNode headPre = new ListNode(0);
        headPre.next = head;
        ListNode slow = headPre;
        ListNode fast = headPre;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
//        return headPre.next;
    }
}
