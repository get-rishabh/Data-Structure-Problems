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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> num = new ArrayList <>();
        while (head != null){
            num.add(head.val);
            head = head.next;
        }
        System.out.println(num);
        Collections.reverse(num);
        int ans = 0;
        for (int i=0 ; i<num.size(); i++){
            ans += Math.pow(2,i)*num.get(i);
        }
        return ans;
        
    }
}


//Optimized by Shifting Operator

class Solution {
    public int getDecimalValue(ListNode head) {
        int num = 0;
        while (head != null){
            num = num << 1 | (head.val);
            head = head.next;
        }
        return num;        
    }
}
