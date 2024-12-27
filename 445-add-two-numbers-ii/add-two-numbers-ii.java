import java.math.BigInteger;
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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        BigInteger num1=getNumberFromList(l1);
        BigInteger num2=getNumberFromList(l2);
        String sum=String.valueOf(num1.add(num2));
        ListNode result=null;
        for(int i=0;i<sum.length();i++){
            result=insertLast(result,Integer.parseInt(String.valueOf(sum.charAt(i))));
        }
        return result;
    }
    public static BigInteger getNumberFromList(ListNode li){
        StringBuilder str=new StringBuilder("");
        while(li!=null){
            str.append(li.val);
            li=li.next;
        }
        //str=str.reverse();
        return new BigInteger(str.toString());
    }
    public static ListNode createNode(int data){
        ListNode newnode=new ListNode();
        newnode.val=data;
        newnode.next=null;
        return newnode;
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