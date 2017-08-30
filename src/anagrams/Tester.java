package anagrams;

/**
 * 
 * @author Nikita Pavlov
 * 
 */
public class Tester {
	
	public static final String STRING_1 = "elvIss";
	public static final String STRING_2 = "lives";

	public static void main(String[] args) throws Exception {
		System.out.println("\"" + STRING_1 + "\"" + " and " + 
							"\"" + STRING_2 + "\"" + " are anagrams? \n" +
							Anagrams.isAnagrams(STRING_1, STRING_2));
	}

}
