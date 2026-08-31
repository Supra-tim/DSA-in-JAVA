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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first=-1;
        int previdx=-1;
        int curridx=1;
        ListNode curr=head.next;
        ListNode prev=head;
        int res[]=new int[2];
        res[0]=Integer.MAX_VALUE;
        while(curr.next!=null){
            ListNode nextnode=curr.next;
            if((curr.val<prev.val && curr.val<nextnode.val) || (curr.val>prev.val && curr.val>nextnode.val)){
                if(previdx==-1){
                    first=curridx;
                    previdx=curridx;
                }
                else{
                    res[0]=Math.min(res[0], curridx-previdx);
                    previdx=curridx;
                }
            }
            prev=prev.next;
            curr=curr.next;
            curridx++;
        }
        if(first!=-1 && res[0]!=Integer.MAX_VALUE){
            res[1]=previdx-first;
        }
        else{
            res[0]=-1;
            res[1]=-1;
        }
        return res;
    }
}