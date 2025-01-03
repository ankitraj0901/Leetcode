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
    public static ListNode middleNode(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println(count);
        temp=head;
        int i;
        for (i = 1; i < count/2; i++) {
            temp=temp.next;
        }
        System.out.println("i "+i);
        if(count%2==0)
            return head=temp.next;
        return head=temp.next;   
    }
}