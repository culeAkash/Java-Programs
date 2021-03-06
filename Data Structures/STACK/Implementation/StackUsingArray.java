package Implementation;

public class StackUsingArray {
	
	private int[] arr;
	private int topIndex;
	
	public StackUsingArray(int size)
	{
		this.arr=new int[size];
		this.topIndex=-1;
	}
	
	public StackUsingArray()
	{
		this.arr= new int[1];
		this.topIndex=-1;
	}
	
	public int size()
	{
		return this.topIndex+1;
	}
	
	public boolean isEmpty()
	{
		if(this.topIndex==-1)
			return true;
		return false;
	}
	
	public void push(int element) 
	{
		if(topIndex==arr.length-1)
		{
			//throw new StackFullException();
			doubleCapacity();
		}
		this.topIndex++;
		this.arr[this.topIndex]=element;
	}
	
	private void doubleCapacity() {
		//System.out.println("abc");
		int[] temp=arr;
		arr= new int[2*temp.length];
		for(int i=0;i<temp.length;i++)
		{
			arr[i]=temp[i];
		}
		
	}

	public int pop() throws StackEmptyException
	{
		if(topIndex==-1)
		{
			throw new StackEmptyException();
		}
		int value=this.arr[this.topIndex];
		this.topIndex--;
		return value;
	}
	
	public int top() throws StackEmptyException
	{
		if(topIndex==-1)
		{
			throw new StackEmptyException();
		}
		return this.arr[this.topIndex];
	}
}
