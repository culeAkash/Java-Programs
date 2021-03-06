import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {

	public static void main(String[] args) {
	int[] arr= {1,1,3,2,2,3,5,6,5,7,8,8,8,8,9,6,7};
	ArrayList<Integer> output= removeDuplicates(arr);
	for(int i:output) {
		System.out.println(i);
	}

	}

	private static ArrayList<Integer> removeDuplicates(int[] arr) {
		ArrayList<Integer> ans= new ArrayList<>();
		if(arr.length==0) {
			return ans;
		}
		HashMap<Integer, Boolean> map= new HashMap<>();
		for(int i:arr) {
			if(!map.containsKey(i)) {
				map.put(i, true);
				ans.add(i);
			}
		}
		return ans;
	}

}
