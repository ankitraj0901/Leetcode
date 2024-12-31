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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        if(k%length==0)
            return head;
        k=k%length;
        int i,data;
        ListNode newnode;
        for(i=1;i<=k;i++){
            data=getLastNodeData(head);
            newnode=createNode(data);
            newnode.next=head;
            head=newnode;
        }
        return head;
    }
    public int getLastNodeData(ListNode head){
        ListNode temp=head;
        while(temp.next.next!=null)
            temp=temp.next;
        int data=temp.next.val;
        temp.next=null;
        return data;
    }
    public ListNode createNode(int data){
        ListNode newnode=new ListNode();
        newnode.val=data;
        newnode.next=null;
        return newnode;
    }
}