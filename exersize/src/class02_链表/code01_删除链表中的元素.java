package class02_链表;

/**
 * @Author: ajie
 * @Date: 2022/11/16
 */
public class code01_删除链表中的元素 {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        int val = 6;
        if (head == null) {
//            return head;
        }
        // 因为删除可能涉及到头节点，所以设置dummy节点，统一操作
        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
//        return dummy.next;
    }
}
