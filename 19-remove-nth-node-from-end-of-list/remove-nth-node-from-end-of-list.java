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
    public static int countList(ListNode li){
        ListNode temp=li;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;

    }
    public static ListNode removeNthFromEnd(ListNode head, int n){
        if(head.next==null)
            return null;
        if(countList(head)==n)
            head=head.next;
        if(head!=null){
            ListNode temp;
            int count;
            count=countList(head);
            int result=count-n;
            temp=head;
            count=0;
            while(temp!=null){
                count++;
                if(count==result)
                    temp.next=temp.next.next;
                temp=temp.next;
            }
            //return head;
        }
        return head;
    }
}