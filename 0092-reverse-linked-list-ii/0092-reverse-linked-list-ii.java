class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
      if(head==null||head.next==null) {
      return head;
      }
      ListNode dummy=new ListNode(-1);
      ListNode prev=dummy;
      dummy.next=head;
      for(int i=0;i<left-1;i++){
        prev=prev.next;
      }
      ListNode curr=prev.next;
      ListNode temp;
      for(int i=0;i<right-left;i++){
        temp=curr.next;
        curr.next=temp.next;
        temp.next=prev.next;
        prev.next=temp;
      }
            return dummy.next;

    }
}