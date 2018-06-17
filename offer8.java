/**
*二叉树的下一个节点
*/


class TreeNode
{
    public int val;
    public TreeNode left,right;
    public TreeNode parent;
    public TreeNode(int val){
        this.val=val;
    }
}


public class Solution {
    public TreeNode succ(TreeNode node)
    {
        if(node==null)
            return null;
        if(node.right!=null)
        {
            TreeNode p=node.right;
            while (p.left!=null)
                p=p.left;
            return p;
        }
        else
        {
            TreeNode current=node;
            TreeNode p=node.parent;
            while (p!=null&&p.right==current)
            {
                current=p;
                p=current.parent;
            }
            return p;
        }
    }   
}