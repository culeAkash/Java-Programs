package SearchAndSort;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int[] input= {1,2,3,4};
		int size= input.length;
		System.out.print("Enter the no. of times the array will be rotated: ");
		int count = s.nextInt();
		int[] rotated_array = rotation(input,size,count);
		System.out.print("The rotated array is: ");
		for(int i=0;i<size;i++)
		{
			
			System.out.print(rotated_array[i]+ " ");
		}

	}
	
	public static int[] rotation(int[] arr,int size,int count) // function to rotate the array
	{
		for(int i=1;i<=count;i++) // no. of times the array is rotated
		{
			int j=0;
			int temp = arr[j];// firstly we store the first element in temp and the shift all other elements one index left
			while(j<size-1) // it will execute upto the secomd last index and it will break from the loop with the value of last index
			{
				arr[j]=arr[j+1];
				j++;
			}
			arr[j]=temp;// the stored first value is then put into the last index
		}
		return arr;
	}

}
