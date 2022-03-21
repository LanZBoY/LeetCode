package Program;

import LeetCode.ListNode;

public class DeleteDuplicates {

    public static void main(String[] args){
        int[] list = {1,1};
        ListNode listNode = ListNode.constructListNode(list);
        ListNode result = deleteDuplicates(listNode);
    }

    public static ListNode deleteDuplicates(ListNode head){
        ListNode current = head;
        ListNode prev = current;
        while (current != null){
            boolean hasDuplicates = false;
            while(current.next != null && current.val == current.next.val){
                hasDuplicates = true;
                current = getLastDuplicates(current).next;
                if(current == null){
                    break;
                }
            }
            if(hasDuplicates){
                if(head.val == head.next.val){
                    head = current;
                    prev = head;
                }else{
                    prev.next = current;
                }
            }
            if(prev != current){
                prev = prev.next;
            }
            if(current == null){
                break;
            }
            current = current.next;
        }

        return head;
    }

    public static ListNode getLastDuplicates(ListNode listNode){
        if(listNode == null){
            return null;
        }
        while(listNode.next != null &&listNode.val == listNode.next.val){
            listNode = listNode.next;
        }
        return listNode;
    }
}
