package LeetCode_Easy;

public class LongestCommonPrefix {
	
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start by assuming the whole first string is the common prefix
        String prefix = strs[0];

        // Compare this prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix by comparing it with each string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

	public static void main(String[] args) {
		
		String[] strs1 = {"flower","flow","flight"};
		String[] strs2 = {"dog","racecar","car"};
		String output1=longestCommonPrefix(strs1);
		String output2=longestCommonPrefix(strs2);
		
		System.out.println("Longest common prefix for the first Array of String is"+ " " + output1);
		System.out.println("Longest common prefix for the second Array of String is"+ " " + output2);

	}

}
