import LeetCode.ListNode;

public class MergeTwoList {
    public static void main(String[] args){
        int[] numbers1 = {1, 2, 4};
        int[] numbers2 = {1, 3, 4};

        ListNode list1 = ListNode.constructListNode(numbers1);
        ListNode list2 = ListNode.constructListNode(numbers2);
        ListNode result = mergeTwoList(list1, list2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode mergeTwoList(ListNode list1, ListNode list2){
        ListNode head = null;
        ListNode current = null;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                if(head == null){
                    head = new ListNode(list1.val);
                    current = head;
                }else{
                    current.next = new ListNode(list1.val);
                    current = current.next;
                }
                list1 = list1.next;
            }else{
                if(head == null){
                    head = new ListNode(list2.val);
                    current = head;
                }else{
                    current.next = new ListNode(list2.val);
                    current = current.next;
                }
                list2 = list2.next;
            }
        }
        if(list1 == null && list2 ==null){
            return null;
        }else if(list1 == null){
            if(head == null){
                head = list2;
            }else{
                current.next = list2;
            }
        }else if(list2 == null){
            if(head == null){
                head = list1;
            }else{
                current.next = list1;
            }
        }
        return head;
    }

    public static ListNode getSmallerNode(ListNode list1, ListNode list2) {
        ListNode result = null;
        if(list1.val <= list2.val){
            result = list1;
            list1 = list1.next;
            return result;
        }
        result = list2;
        list2 = list2.next;
        return result;
    }


}
