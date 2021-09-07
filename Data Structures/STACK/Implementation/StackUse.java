package Implementation;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		StackUsingArray stack= new StackUsingArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.size());
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.top());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		//stack.pop();
		System.out.println(stack.size());
		if(stack.isEmpty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Stack is not empty");
		}
	}

}
