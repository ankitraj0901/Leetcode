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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return null;
        ListNode head1=null,head2=null,temp=head;
        int count=0;
        while(temp!=null){
            count++;
            if(count%2!=0)
                head1=insertLast(head1,temp.val);
            else
                head2=insertLast(head2,temp.val);
            temp=temp.next;
        }
        temp=head1;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=head2;
        return head1;
    }
    public ListNode insertLast(ListNode list3, int data) {
        ListNode newnode = new ListNode(data, null);
        if (list3 == null)
            return newnode;
        ListNode temp = list3;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newnode;
        return list3;
    }
}