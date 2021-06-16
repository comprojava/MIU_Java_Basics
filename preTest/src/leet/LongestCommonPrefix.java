package leet;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		String longestPrefix = strs[0];
		int n=strs.length;
		for(int i=0;i<n;i++) {
			while(strs[i].indexOf(longestPrefix)!=0)
				longestPrefix=longestPrefix.substring(0, longestPrefix.length()-1);
				
		}
		return longestPrefix;
	}

	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
		System.out.println(longestCommonPrefix(new String[] {"dog","racecar","car"}));

	}

}
