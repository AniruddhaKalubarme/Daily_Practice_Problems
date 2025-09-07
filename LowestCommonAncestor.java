import java.util.*;

TreeNode LCA(TreeNode root, int n1, int n2)
{
    if(root == null)
        return null;

    if(root.data == n1 || root.data == n2)
        return root;
    
    TreeNode left = LCA(TreeNode(root.left, n1, n2));
    TreeNode right = LCA(TreeNode(root.right, n1, n2));
    
    if(left == null && right == null)
        return null;

    if(left!=null && right!=null)
        return root;
    
    if(left == null)
        return right;
    
    if(right == null)
        return left;
} 

class LowestCommonAncestor
{
    public static void main(Static []args)
    {
        LCA(root, n1, n2);
    }
}