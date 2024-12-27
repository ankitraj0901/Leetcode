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
    public ListNode modifiedList(int[] nums, ListNode head) {
        boolean set[]=new boolean[(int)1e5+1];
        for(int num:nums)
            set[num]=true;
            ListNode prev=head,temp=head;
            while(temp!=null){
                if(set[temp.val]==true){
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