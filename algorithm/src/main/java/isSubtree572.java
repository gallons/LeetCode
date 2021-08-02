import utils.TreeNode;

public class isSubtree572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null) return true; // t 为 null 一定都是 true
        if(root==null) return false;  // 这里 t 一定不为 null, 只要 s 为 null，肯定是 false
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot)||isSameTree(root,subRoot);
    }
    /**
     * 判断两棵树是否相同
     */
    public boolean isSameTree(TreeNode s, TreeNode t){
        if(s==null&&t==null) return true;
        if(s==null||t==null) return false;
        if(s.val!=t.val) return false;
        return isSameTree(s.left,t.left)&&isSameTree(s.right,t.right);

    }
}
