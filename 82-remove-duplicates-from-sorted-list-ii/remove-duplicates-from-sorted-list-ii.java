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
        if(head.next==null)
            return head;
        ListNode temp, prev = head;
        temp = prev.next;
        while (temp != null) {
            if (prev.val == temp.val) {
                head=removeElements(head,prev.val);
                temp = temp.next;
                prev.next = temp;
            } 
            else{
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
    public static ListNode removeElements(ListNode head,int val){
        if(head==null)
            return null;
        ListNode prev=head,temp=head;
        while(temp!=null){
            if(temp.val==val){
                if(head==temp){
                    head=head.next;
                    temp=head;
                    prev=temp;
                    continue;
                }
                else if(temp==head&&temp.next==null)
                    head=null;
                else if(temp.next==null){
                    prev.next=null;
                }
                else{
                    prev.next=temp.next;
                    temp=prev.next;
                    continue;
                }
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
}