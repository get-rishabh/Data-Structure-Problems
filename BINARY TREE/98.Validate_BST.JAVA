public class Solution {

    
    private Integer prev = null;
    
    public boolean isValidBST(TreeNode root) { 
        return Traversal(root, Long.MAX_VALUE, Long.MIN_VALUE);
                
    }


    private boolean Traversal (TreeNode root,long minValue, long maxValue) {
        if (root == null) return true;
        if (root < minValue || root > maxValue) return false;

        Traversal(root.left, minValue, root.val);
        Traversal(root.right, root.val, maxValue);

    }
} 
