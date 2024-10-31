package linkedlist.IntersectionFinder;


public class IntersectionFinder2 {
    
    // Hàm để tìm điểm giao nhau giữa hai danh sách liên kết
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        // Tính độ dài của hai danh sách
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        
        // Cân bằng độ dài của hai danh sách
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        
        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }
        
        // Tìm điểm giao nhau
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        
        // Trả về node giao nhau hoặc null nếu không có điểm giao nhau
        return headA;
    }
    
    // Hàm phụ để tính độ dài của danh sách liên kết
    private static int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
    
    public static void main(String[] args) {
        // Tạo hai danh sách liên kết có điểm giao nhau
        ListNode common = new ListNode(4);
        common.next = new ListNode(5);
        
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = common;
        
        ListNode headB = new ListNode(9);
        headB.next = common;
        
        ListNode intersection = getIntersectionNode(headA, headB);
        
        if (intersection != null) {
            System.out.println("Điểm giao nhau tại node có giá trị: " + intersection.value);
        } else {
            System.out.println("Không có điểm giao nhau.");
        }
    }
}
