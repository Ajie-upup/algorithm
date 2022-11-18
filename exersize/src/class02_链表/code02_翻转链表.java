package class02_链表;

/**
 * @Author: ajie
 * @Date: 2022/11/18
 */
public class code02_翻转链表 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode pre = null;

        while (head != null) {
            ListNode currentNode = new ListNode(head.val);
            currentNode.next = pre;
            pre = currentNode;
            head = head.next;
        }
        //return pre;

        //双指针法
        ListNode prev = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            //保存下一个节点的地址
            temp = cur.next;

            cur.next = prev;
            prev = cur;
            cur = temp;
        }
    }
}
