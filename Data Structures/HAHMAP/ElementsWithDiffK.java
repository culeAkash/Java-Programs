import java.util.HashMap;
import java.util.Scanner;

public class ElementsWithDiffK {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size= s.nextInt();
		
		int[] arr= new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		
		elementsWithDiffK(arr,k);

	}

	private static void elementsWithDiffK(int[] arr,int k) {
		if(arr.length==0)
			return;
		
		HashMap<Integer, Integer> map= new HashMap<>();
		int count=0;
		for(int i: arr) {
			if(!map.containsKey(i)) {
				map.put(i, 1);
			}
			else {
				int temp= map.get(i);
				temp++;
				map.put(i, temp);
			}
		}
		System.out.println(count);
		
	}

}
