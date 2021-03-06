package SearchAndSort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] input= {2,5,6,9,8,10,11,7,4};
		int size= input.length;
		int[] sorted_arr= bubble_sort(input,size);
		for(int i=0;i<size;i++)
		{
			System.out.println(sorted_arr[i]);
		}

	}
	
	public static int[] bubble_sort(int[] arr,int size)
	{
		for(int round=1;round<=size-1;round++)// there will be n-1 rounds for n no. of array elements
		{
			for(int i=0;i<size-round;i++)// for each round a iteration will be less
			{
				if(arr[i]>arr[i+1])
				{
					int temp = arr[i];
					arr[i]= arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		return arr;
	}

}
