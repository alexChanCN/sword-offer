package ch2;

public class Q8 {
    class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if (pNode.right!=null){
            pNode = pNode.right;
            while (pNode.left != null)
                pNode= pNode.left;
            return pNode;
        }
        else {
            while (pNode.next!= null && pNode.next.left!=pNode){
                pNode = pNode.next;
            }
            return pNode.next;
        }
    }
}
