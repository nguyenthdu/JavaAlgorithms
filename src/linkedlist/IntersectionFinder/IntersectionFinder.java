package linkedlist.IntersectionFinder;
//tim giao diem cua 2 linked list
public class IntersectionFinder {
    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        ListNode headB = new ListNode(5);
        ListNode node1 = new ListNode(8);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(0);
        ListNode node6 = new ListNode(1);
        headA.next = node1;
        headB.next = node2;
        node1.next = node3;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        
        System.out.println(getIntersectionNode(headA, headB).value);
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        while(p1 != p2) {
            p1 = (p1 == null) ? headB : p1.next;
            p2 = (p2 == null) ? headA : p2.next;
        }
        return p1;
    }
}
