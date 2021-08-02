import utils.ListNode;

public class rmduplicates82 {

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
            return head;
        //先定义一个虚节点
        ListNode dummy=new ListNode(0,head);

        ListNode cur=dummy;
        while(cur.next!=null&&cur.next.next!=null){
            if(cur.next.val==cur.next.next.val){
                int x=cur.next.val;
                while(cur.next!=null&&cur.next.val==x){
                    cur.next=cur.next.next;
                }
            }else{
                cur=cur.next;
            }
        }
        return dummy.next;

    }
}
