package class02_链表;

/**
 * 构造单链表
 *
 * @Author: ajie
 * @Date: 2022/11/16
 */
public class ListNode {
    //结点的值
    int val;
    //结点指向的下一个结点
    ListNode next;

    //结点的无参构造
    public ListNode() {
    }
    //结点的有参构造（带一个参数）
    public ListNode(int val) {
        this.val = val;
    }
    //结点的有参构造（带两个参数）
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
