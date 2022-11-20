package class02_链表;

/**
 * @Author: ajie
 * @Date: 2022/11/19
 */
public class code04_单链表相交 {
    public static void main(String[] args) {
        ListNode headA = new ListNode(0);
        ListNode headB = new ListNode(1);
        //判断参数不合法的情况
        if (headA == null && headB == null) {
            return;
        }

        ListNode curA = headA;
        ListNode curB = headB;

        int lenA = 0, lenB = 0;
        while (curA != null) {
            lenA++;
            curA = curA.next;
        }
        while (curB != null) {
            lenB++;
            curB = curB.next;
        }
        curA = headA;
        curB = headB;
        //保证lenA始终为较长的链表
        if (lenB > lenA) {
            //长度交换
            lenA = lenA ^ lenB;
            lenB = lenA ^ lenB;
            lenA = lenA ^ lenB;
            //节点交换
            curA = headB;
            curB = headA;
        }
        int differ = lenA - lenB;
        int i = 0;
        while (i < differ) {
            curA = curA.next;
            i++;
        }
        while (curA != null) {
            if (curA == curB) {
//                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }

    }
}
