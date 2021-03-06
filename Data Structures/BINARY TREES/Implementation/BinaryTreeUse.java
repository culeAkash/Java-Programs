package Implementation;

import java.util.Scanner;

public class BinaryTreeUse {

	public static void main(String[] args) {
		
		
//		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(1); //root node with data=1
//		BinaryTreeNode<Integer> rootLeft= new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> rootRight= new BinaryTreeNode<>(3);
//		root.left=rootLeft;
//		root.right=rootRight;
//		
//		BinaryTreeNode<Integer> secondRight= new BinaryTreeNode<>(4);
//		BinaryTreeNode<Integer> thirdLeft= new BinaryTreeNode<>(5);
//		rootLeft.right=secondRight;
//		rootRight.left=thirdLeft;
		
		BinaryTreeNode<Integer> root= takingInput();
		
		printTree(root);

	}
	
	public static void printTree(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		
		System.out.print(root.data+": ");
		if(root.left!=null)
		{
			System.out.print("L"+root.left.data+" ");
		}
		if(root.right!=null)
		{
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		printTree(root.left);
		printTree(root.right);
	}
	
	public static BinaryTreeNode<Integer> takingInput(){
		Scanner s= new Scanner(System.in);
		int num= s.nextInt();
		if(num==-1)
		{
			return null;
		}
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(num);
		System.out.println("Enter the left child of "+root.data );
		root.left=takingInput();
		System.out.println("Enter the right child of "+root.data );
		root.right=takingInput();
		return root;
		
		
	}

}
