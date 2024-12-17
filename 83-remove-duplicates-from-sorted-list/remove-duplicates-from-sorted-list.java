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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode temp,prev=head;
        temp=prev.next;
        while(temp!=null){
            if(prev.val==temp.val){
                temp=temp.next;
                prev.next=temp;
            }
            else{
                prev=temp;
                temp=temp.next;
            }
        }
        return head;
    }
}