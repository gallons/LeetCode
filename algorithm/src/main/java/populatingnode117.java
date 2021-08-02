import utils.Node;

import java.util.LinkedList;
import java.util.Queue;

public class populatingnode117 {
    //Bfs广度优先算法
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> queue =new LinkedList<Node>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int n=queue.size();
            Node last=null;
            for(int i=1;i<=n;i++){//遍历当前层的节点
                Node cur=queue.poll();
                //把当前节点的左右子节点存入队列，如果存在的话
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
                if(i!=1){
                    last.next= cur;
                }
                last=cur;
            }
        }
        return root;
    }

    public Node connect2(Node root) {
        if(root==null) return root;
        //当作每一层的链表
        Node cur=root;
        while(cur!=null){
            //遍历当前层的时候，为了方便操作在下一层前面添加一个哑结点（注意这里是访问当前层的节点，然后把下一层的节点串起来）
            Node dump=new Node(0);
            Node pre=dump;
            //开始遍历当前层的链表
            while(cur!=null){
                if(cur.left!=null){
                    pre.next=cur.left;
                    pre=pre.next;
                }
                if(cur.right!=null){
                    pre.next=cur.right;
                    pre=pre.next;

                }
                //继续访问这一行的下一个节点
                cur=cur.next;
            }
            //把下一层串联成一个链表之后，让他赋值给cur，
            //后续继续循环，直到cur为空为止
            cur = dump.next;
        }
        return root;
    }
    
}

