class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //edge cases
        if(list1==null) return list2;
        if(list2==null) return list1;
        if(list1==null && list2==null) return list1;

        ListNode ans=new ListNode();
        ListNode node=ans;
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                node.next=list1;
                list1=list1.next;
                node=node.next;
            }else{ 
               node.next=list2;
               list2=list2.next;
               node=node.next;
           }
        }
    while(list1!=null){
        node.next=list1;
        list1=list1.next;
        node=node.next;
    }
    while(list2!=null){
        node.next=list2;
        list2=list2.next;
        node=node.next;
    }
   return ans.next;
  }
}
