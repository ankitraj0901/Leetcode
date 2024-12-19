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
    public ListNode reverseList(ListNode head) {
        ListNode head2=null,temp=head;
        while(temp!=null){
            head2=insertFirst(head2,temp.val);
            temp=temp.next;
        }
        return head2;
    }
    public ListNode insertFirst(ListNode head2,int data) {
        ListNode newnode=new ListNode(data);
        newnode.next=head2;
        head2=newnode;
        return head2;
    }
}