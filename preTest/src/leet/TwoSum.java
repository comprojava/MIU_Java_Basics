package leet;

public class TwoSum {
	public static int[] twosum(int[] nums, int target) {
		int n = nums.length;
		int[] result = new int[2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
