package Implementation;

public class StackUseLL {

	public static void main(String[] args) throws StackEmptyException {
		StackUsingLL<Integer> stack= new StackUsingLL<>();
		int[] arr= {1,2,3,4,5};
		for(int i:arr)
		{
			stack.push(i);
		}
		System.out.println(stack.size());
		stack.pop();
		stack.pop();
		System.out.println(stack.size());
		System.out.println(stack.peek());
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}

	}

}
