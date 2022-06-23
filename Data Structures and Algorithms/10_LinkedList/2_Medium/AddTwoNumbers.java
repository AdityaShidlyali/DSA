// https://leetcode.com/problems/add-two-numbers/
// Time complexity: O(n) where n is total number of nodes in given lists l1 and l2
// Space complexity: O(1)

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ansListHead = new ListNode();
        ListNode curr = ansListHead;
        int carry = 0;
        
        while (l1 != null || l2 != null || carry != 0) {
            int digFromL1 = 0, digFromL2 = 0;
            if (l1 != null) {
                digFromL1 = l1.val;
            } else {
                digFromL1 = 0;
            }
            
            if (l2 != null) {
                digFromL2 = l2.val;
            } else {
                digFromL2 = 0;
            }
            
            int additionDigit = digFromL1 + digFromL2 + carry;
            carry = additionDigit / 10;
            additionDigit = additionDigit % 10;
            
            if (l1 != null) {
                l1 = l1.next;
            }
            
            if (l2 != null) {
                l2 = l2.next;
            }
            
            curr.next = new ListNode(additionDigit, null);
            curr = curr.next;
        }
        
        return ansListHead.next;
    }
}