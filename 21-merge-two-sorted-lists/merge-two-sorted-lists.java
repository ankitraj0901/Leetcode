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
    public static ListNode insertLast(ListNode list3,int data){
        ListNode newnode=new ListNode(data,null);
        if(list3==null)
            return newnode;
        ListNode temp=list3;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=newnode;
        return list3;
   } 
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if(list1==null&&list2==null)
            return list1;
        else if(list1==null)
            return list2;
        else if(list2==null)
            return list1;

       ListNode list3=null;
       while(list1 != null && list2!=null){
            if(list1.val<=list2.val){
                list3=insertLast(list3,list1.val);
                list1 = list1.next;
            }
            else{
                list3=insertLast(list3,list2.val);
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            list3 = insertLast(list3, list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            list3 = insertLast(list3, list2.val);
            list2 = list2.next;
        }

        return list3;
       
    }
}
