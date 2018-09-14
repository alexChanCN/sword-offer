package utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author： Chen Shuai
 * @Date: 2018/8/2 下午2:18
 */
public class TreeNodeUtils {

    public static TreeNode creatBinaryTree(int[] datas){
        List<TreeNode> list = new ArrayList<>();
        //将数组变成TreeNode节点
        for(int TreeNodeindex=0;TreeNodeindex<datas.length;TreeNodeindex++){
            TreeNode node = new TreeNode(datas[TreeNodeindex]);
            list.add(node);
        }
        //给所有父节点设定子节点
        for(int index=0;index<list.size()/2-1;index++){
            //编号为n的节点他的左子节点编号为2*n 右子节点编号为2*n+1 但是因为list从0开始编号，所以还要+1
            //这里父节点有1（2,3）,2（4,5）,3（6,7）,4（8,9） 但是最后一个父节点有可能没有右子节点 需要单独处理
            list.get(index).setLeft(list.get(index*2+1));
            list.get(index).setRight(list.get(index*2+2));
        }
        //单独处理最后一个父节点  因为它有可能没有右子节点
        int index = list.size()/2-1;
        list.get(index).setLeft(list.get(index*2+1)); //先设置左子节点
        if(list.size() % 2 == 1){ //如果有奇数个节点，最后一个父节点才有右子节点
            list.get(index).setRight(list.get(index*2+2));
        }
        return list.get(0);
    }
    /**
     * 遍历当前节点的值
     * @param list
     * @param TreeNode
     *//*
    public void checkCurrentTreeNode(TreeNode TreeNode){
        System.out.print(TreeNode.getVar()+" ");
    }
    *//**
     * 先序遍历二叉树
     * @param root 二叉树根节点
     *//*
    public void preOrderTraversal(TreeNode TreeNode){
        if (TreeNode == null)  //很重要，必须加上 当遇到叶子节点用来停止向下遍历
            return;
        checkCurrentTreeNode(TreeNode);
        preOrderTraversal(TreeNode.getLeft());
        preOrderTraversal(TreeNode.getRight());
    }
    *//**
     * 中序遍历二叉树
     * @param root 根节点
     *//*
    public void inOrderTraversal(TreeNode TreeNode){
        if (TreeNode == null)  //很重要，必须加上
            return;
        inOrderTraversal(TreeNode.getLeft());
        checkCurrentTreeNode(TreeNode);
        inOrderTraversal(TreeNode.getRight());
    }
    *//**
     * 后序遍历二叉树
     * @param root 根节点
     *//*
    public void postOrderTraversal(TreeNode TreeNode){
        if (TreeNode == null)  //很重要，必须加上
            return;
        postOrderTraversal(TreeNode.getLeft());
        postOrderTraversal(TreeNode.getRight());
        checkCurrentTreeNode(TreeNode);
    }

    *//**
     * 非递归前序遍历
     * @param TreeNode
     *//*
    public void preOrderTraversalbyLoop(TreeNode TreeNode){
        Stack<TreeNode> stack = new Stack();
        TreeNode p = TreeNode;
        while(p!=null || !stack.isEmpty()){
            while(p!=null){ //当p不为空时，就读取p的值，并不断更新p为其左子节点，即不断读取左子节点
                checkCurrentTreeNode(p);
                stack.push(p); //将p入栈
                p = p.getLeft();
            }
            if(!stack.isEmpty()){
                p = stack.pop();
                p = p.getRight();
            }
        }
    }
    *//**
     * 非递归中序遍历
     * @param TreeNode
     *//*
    public void inOrderTraversalbyLoop(TreeNode TreeNode){
        Stack<TreeNode> stack = new Stack();
        TreeNode p = TreeNode;
        while(p!=null || !stack.isEmpty()){
            while(p!=null){
                stack.push(p);
                p = p.getLeft();
            }
            if(!stack.isEmpty()){
                p = stack.pop();
                checkCurrentTreeNode(p);
                p = p.getRight();
            }
        }
    }
    *//**
     * 非递归后序遍历
     * @param TreeNode
     *//*
    public void postOrderTraversalbyLoop(TreeNode TreeNode){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = TreeNode,prev = TreeNode;
        while(p!=null || !stack.isEmpty()){
            while(p!=null){
                stack.push(p);
                p = p.getLeft();
            }
            if(!stack.isEmpty()){
                TreeNode temp = stack.peek().getRight();
                if(temp == null||temp == prev){
                    p = stack.pop();
                    checkCurrentTreeNode(p);
                    prev = p;
                    p = null;
                }else{
                    p = temp;
                }
            }
        }
    }

    *//**
     * 广度优先遍历（从上到下遍历二叉树）
     * @param root
     *//*
    public void bfs(TreeNode root){
        if(root == null) return;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root); //首先将根节点存入队列
        //当队列里有值时，每次取出队首的TreeNode打印，打印之后判断TreeNode是否有子节点，若有，则将子节点加入队列
        while(queue.size() > 0){
            TreeNode TreeNode = queue.peek();
            queue.poll(); //取出队首元素并打印
            System.out.print(TreeNode.var+" ");
            if(TreeNode.left != null){ //如果有左子节点，则将其存入队列
                queue.offer(TreeNode.left);
            }
            if(TreeNode.right != null){ //如果有右子节点，则将其存入队列
                queue.offer(TreeNode.right);
            }
        }
    }
    *//**
     * 深度优先遍历
     * @param TreeNode
     * @param rst
     * @param list
     *//*
    public void dfs(TreeNode TreeNode,List<List<Integer>> rst,List<Integer> list){
        if(TreeNode == null) return;
        if(TreeNode.left == null && TreeNode.right == null){
            list.add(TreeNode.var);
            *//* 这里将list存入rst中时，不能直接将list存入，而是通过新建一个list来实现，
             * 因为如果直接用list的话，后面remove的时候也会将其最后一个存的节点删掉*//*
            rst.add(new ArrayList<>(list));
            list.remove(list.size()-1);
        }
        list.add(TreeNode.var);
        dfs(TreeNode.left,rst,list);
        dfs(TreeNode.right,rst,list);
        list.remove(list.size()-1);
    }*/

}
