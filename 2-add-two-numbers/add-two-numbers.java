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
    public static BigInteger getNumByList(ListNode li){
		StringBuilder str = new StringBuilder("");
		while (li != null) {
			str.append(li.val);
			li = li.next;
		}
		//str.append(li.val);
        str = str.reverse();
		return new BigInteger(str.toString());
	}

	public static ListNode createNode(int val){
		ListNode newNode = new ListNode();
		newNode.val = val;
		newNode.next = null;
		return newNode;
	}

	public static ListNode addFirst(ListNode li, int val) {
		if (li == null) {
			return createNode(val);
		}
		ListNode temp = new ListNode();
		temp.val = val;
		temp.next = li;
		return temp;
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger num1 = getNumByList(l1);
        BigInteger num2 = getNumByList(l2);
		String sum = String.valueOf(num1.add(num2));
		ListNode result = null;
		for (int i = 0; i < sum.length(); i++) {
			result = addFirst(result, Integer.parseInt(String.valueOf(sum.charAt(i))));
		}
		return result;
    }
}