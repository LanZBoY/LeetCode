package LeetCode;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode constructListNode(int [] numbers){
        ListNode head = null;
        ListNode current = null;

        for(int number : numbers){
            if(head == null){
                head = new ListNode(number);
                current = head;
            }else{
                current.next = new ListNode(number);
                current = current.next;
            }
        }

        return head;
    }
}
