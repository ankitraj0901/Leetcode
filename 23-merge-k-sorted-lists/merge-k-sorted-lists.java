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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode temp,head=null;
        int i;
        for(i=0;i<lists.length;i++){
            temp=lists[i];
            while(temp!=null){
                head=insertLast(head,temp.val);
                temp=temp.next;
            }
        }
        sortList(head);
        return head;
    }
    public void sortList(ListNode head){
         ListNode temp1=head;
        int data;
        while(temp1!=null){
        ListNode prev=head;
        ListNode temp=prev.next;
            while(temp!=null){
                if(prev.val>temp.val){
                    data=prev.val;
                    prev.val=temp.val;
                    temp.val=data;
                }
                prev=temp;
                temp=temp.next;
            }
            temp1=temp1.next;
        }    
    }
    public static ListNode insertLast(ListNode list3, int data) {
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