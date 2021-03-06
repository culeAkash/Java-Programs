package Assignment2;

import java.util.Scanner;

import RecursiveLL.LinkedList;
import RecursiveLL.Node;

public class DeleteNNodes {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Node<Integer> head= LinkedList.createList();
		int m= s.nextInt();
		int n= s.nextInt();
		head= deleteNnodes(head,m,n);
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}

	}
	
	public static Node<Integer> deleteNnodes(Node<Integer> head,int m, int n)
	{
		if(head==null)
		{
			return head;
		}
		Node<Integer> newHead=null,newTail=null;
		while(head!=null)
		{
			int i=0;
			while(head!=null && i<m)
			{
				if(newHead==null)
				{
					newHead=head;
					newTail=head;
				}
				else
				{
					newTail.next=head;
					newTail=newTail.next;
				}
				head=head.next;
				i++;
			}
			i=0;
			while(head!=null && i<n)
			{
				head=head.next;
				i++;
			}
		}
		if(newHead==null)
		{
			return head;
		}
		newTail.next=null;
		return newHead;
		
	}

}
