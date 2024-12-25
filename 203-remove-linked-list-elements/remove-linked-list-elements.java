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
    public static ListNode removeElements(ListNode head,int val){
        if(head==null)
            return null;
        if(allsame(head,val))
            head=null;
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
                    System.out.println("hello");
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
    public static boolean allsame(ListNode head,int data){
        ListNode temp=head;
        while(temp!=null){
            if(temp.val!=data)
                return false;
            temp=temp.next;
        }
        return true;
    }
}