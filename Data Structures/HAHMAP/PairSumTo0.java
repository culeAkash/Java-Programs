import java.util.HashMap;
import java.util.Scanner;

public class PairSumTo0 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size= s.nextInt();
		int[] arr= new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		int count= countPair(arr);
		System.out.println(count);
	}

	private static int countPair(int[] arr) {
		if(arr.length==0 || arr.length==1) {
			return 0;
		}
		HashMap<Integer, Integer> map= new HashMap<>();
		for(int i:arr) {
			int j=(0-i);
			System.out.println(j);
			if(map.containsKey(j)) {
				int temp=map.get(j);
				temp++;
				map.put(j, temp);
			}
			else {
				map.put(j, 1);
			}
		}
		int count=0;
		for(int i:arr) {
			if(map.containsKey(i)) {
				count++;
			}
		}
		return count;
	}

}
