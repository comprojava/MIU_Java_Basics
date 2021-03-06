package leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_recommended {
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int n = nums.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			temp = target - nums[i];
			if (map.containsKey(temp))
				return new int[] { map.get(temp), i };
			map.put(nums[i], i);
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
		System.out.println(Arrays.toString(twoSum(new int[] { 3, 2, 4 }, 6)));
		System.out.println(Arrays.toString(twoSum(new int[] { 3, 3 }, 6)));

	}

}
