package anagrams;

import java.util.Arrays;
/**
 * 
 * @author Nikita Pavlov
 *
 */

public class Anagrams {
		
	/**
	 * <p> Simple check if Strings are anagrams.
	 * @param string1
	 * @param string2
	 * @return true if Strings are anagrams, otherwise false. 
	 * @throws Exception if Strings have different length or letters are not rearranged.
	 */
	public static boolean isAnagrams(String string1, String string2) throws Exception{
		if(string1.length() != string2.length()) throw new Exception("Strings have different length they can’t be anagrams!"); 
		if(string1.toLowerCase().equals(string2.toLowerCase())) throw new Exception("String1 and String2 is the same! Letters are not rearranged.");
		char[] s1 = string1.toLowerCase().toCharArray();
		char[] s2 = string2.toLowerCase().toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		return Arrays.equals(s1, s2);
	}

}
