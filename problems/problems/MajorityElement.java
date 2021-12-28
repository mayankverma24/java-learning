package problems;

import java.util.HashMap;

//Boyer-Moore Voting Algorithm
//The majority element is the element that appears more than n/2 times. You may assume that the majority element always exists in the array.
public class MajorityElement {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 1, 1, 1, 2, 2,1,2 };
		System.out.println(majorityElement(arr));
		findMajorityUsingHashMap(arr);
	}

	public static int majorityElement(int[] nums) {
		int count = 0;
		Integer candidate = null;
		for (int num : nums) {
			if (count == 0) {
				candidate = num;
			}
			if (num == candidate) {
				count += 1;
			} else {
				count -= 1;
			}
			// count += (num == candidate) ? 1 : -1;
		}
		return candidate;
	}

	public static void findMajorityUsingHashMap(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int count = map.get(arr[i]) + 1;
				if (count > arr.length / 2) {
					System.out.println("Majority found :- " + arr[i]);
					return;
				} else
					map.put(arr[i], count);
			} else
				map.put(arr[i], 1);
		}
		System.out.println(" No Majority element");
	}

}
