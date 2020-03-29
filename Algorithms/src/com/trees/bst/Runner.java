package com.trees.bst;

public class Runner {

	public static void main(String[] args) {
		InsertAndSearchInBST insertAndSearchInBST = new InsertAndSearchInBST();
		TraversalsWithRecursion traversalsWithRecursion = new TraversalsWithRecursion();
		TraversalsUsingStack traversalsUsingStack = new TraversalsUsingStack();
		LeftViewOfBinaryTree leftViewOfBinaryTree = new LeftViewOfBinaryTree();
		RightViewOfBinaryTree rightViewOfBinaryTree = new RightViewOfBinaryTree();
		TopViewOfBinaryTree topViewOfBinaryTree = new TopViewOfBinaryTree();
		BottomViewOfBinaryTree bottomViewOfBinaryTree = new BottomViewOfBinaryTree();
		CheckChildSumPropertyOfTree checkChildSumPropertyOfTree = new CheckChildSumPropertyOfTree();
		Tree root = null;
		root = insertAndSearchInBST.insert(20, root);
		insertAndSearchInBST.insert(10, root);
		insertAndSearchInBST.insert(30, root);
		insertAndSearchInBST.insert(5, root);
		insertAndSearchInBST.insert(15, root);
		insertAndSearchInBST.insert(25, root);
		insertAndSearchInBST.insert(35, root);
		System.out.println("Inorder Traversal:");
		traversalsWithRecursion.inorder(root);
		System.out.println();
		System.out.println("PostOrder Traversal:");
		traversalsWithRecursion.postorder(root);
		System.out.println();
		System.out.println("PreOrder Traversal:");
		traversalsWithRecursion.preorder(root);
		System.out.println();
		System.out.println("LevelOrder Traversal:");
		traversalsWithRecursion.levelOrder(root);
		System.out.println();
		System.out.println("Vertical Order Traversal");
		traversalsWithRecursion.verticalOrder(root);
		System.out.println();
		System.out.println("Search 25 in tree");
		insertAndSearchInBST.search(25, root);
		System.out.println();
		System.out.println("Search 42 in tree");
		insertAndSearchInBST.search(42, root);
		System.out.println();
		System.out.println("Inorder traversal without recursion");
		traversalsUsingStack.inorder(root);
		System.out.println();
		System.out.println("PreOrder traversal without recursion");
		traversalsUsingStack.preorder(root);
		System.out.println();
		System.out.println("Left view");
		leftViewOfBinaryTree.leftView(root);
		System.out.println();
		System.out.println("Right view");
		rightViewOfBinaryTree.rightView(root);
		System.out.println();
		System.out.println("Top view");
		topViewOfBinaryTree.topView(root);
		System.out.println();
		System.out.println("Bottom view");
		bottomViewOfBinaryTree.bottomView(root);
		System.out.println();
		System.out.println("check child sum property");
		if(checkChildSumPropertyOfTree.childSumPropertyCheck(root)) {
        	System.out.println("Property true");
        }else {
        	System.out.println("Property false");
        }
		Tree root1 = null;
		root1 = new Tree(10); 
        root1.left = new Tree(8); 
        root1.right = new Tree(2); 
        root1.left.left = new Tree(3); 
        root1.left.right = new Tree(5); 
        root1.right.right = new Tree(2); 
        System.out.println();
        System.out.println("check child sum property");
        if(checkChildSumPropertyOfTree.childSumPropertyCheck(root1)) {
        	System.out.println("Property true");
        }

		
	}

}
