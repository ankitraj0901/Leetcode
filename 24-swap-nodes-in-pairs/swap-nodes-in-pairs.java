/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode prev=head,temp=prev.next;
        int data;
        while(prev != null && temp!=null){
            data=prev.val;
            prev.val=temp.val;
            temp.val=data;
            if(temp.next==null)
                break;
            prev=temp.next;
            temp=prev.next;
        }
        return head;
    }
}