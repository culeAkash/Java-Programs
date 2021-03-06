import java.util.HashMap;
import java.util.Scanner;

public class LongestConsecutive {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size= s.nextInt();
		int[] arr= new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		
		longestConsecutiveBetter(arr);

	}

	private static void longestConsecutiveBetter(int[] arr) {
		if(arr.length==0) {
			return;
		}
		
		HashMap<Integer, Boolean> map= new HashMap<>();
		
		for(int i:arr) {
			map.put(i, true);
		}
		
		int maxLength=0;
		int lowest=0;
		
		for(int i: arr) {
			int length=0;
			int small=i;
			
			int j=i;
			while(map.containsKey(j)) {
				length++;
				map.remove(j);
				j++;
			}
			j=i-1;
			while(map.containsKey(j)) {
				length++;
				map.remove(j);
				j--;
			}
			small=j+1;
			if(length>=maxLength) {
				maxLength=length;
				lowest=small;
			}
			
		}
		
		System.out.println(lowest+" "+(lowest+maxLength-1));
		
	}

	private static void longestConsecutive(int[] arr) {
		if(arr.length==0) {
			return;
		}
		
		HashMap<Integer, Boolean> map= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], true);
		}
		
		int min=0;
		int max=0;
		int minFinal=0;
		int maxFinal=0;
		int diff=0;
		int diffFinal=0;
		
		while(map.size()!=0) {
			if(!map.containsKey(min)) {
				min=max+1;
				max=max+1;
			}
			else {
				if(!map.containsKey(max+1)) {
					map.remove(min);
					diff=max-min;
					if(diff>diffFinal) {
						diffFinal=diff;
						minFinal=min;
						maxFinal=max;
					}
					min=max+1;
					max=max+1;
				}
				else {
					max=max+1;
					map.remove(max);
				}
			}
				
		}
		System.out.println(minFinal+" "+maxFinal);
		
	}

}
