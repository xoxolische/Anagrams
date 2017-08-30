package junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import anagrams.Anagrams;


/**
 * 
 * @author Nikita Pavlov
 *
 */

public class AnagramsTest {
	static final String STRING_1 = "elvis";
	static final String STRING_2 = "lives";
	static final String STRING_3 = "ElViS";
	static final String STRING_4 = "LiVeS";
	static final String STRING_5 = "eliVs";
	static final String STRING_6 = "elsis";
	static final String STRING_7 = "eleven";
	static final String STRING_8 = "elveEn";

	
	@Test
	public void testTwoStringsThatAreAnagrams() throws Exception {		
		assertTrue(Anagrams.isAnagrams(STRING_1, STRING_2));		
	}
	
	@Test
	public void testTwoStringsThatAreAnagramsAndWithUpperCaseLetters() throws Exception {		
		assertTrue(Anagrams.isAnagrams(STRING_7, STRING_8));		
	}
	
	@Test
	public void testTwoStringsThatAreAnagramsAndWithUpperCaseLetters2() throws Exception {		
		assertTrue(Anagrams.isAnagrams(STRING_7, STRING_8));		
	}
	
	@Test
	public void testTwoStringsThatAreAnagramsAndWithUpperCaseLetters3() throws Exception {		
		assertTrue(Anagrams.isAnagrams(STRING_3, STRING_5));		
	}
	
	@Test
	public void testTwoStringsThatAreAnagramsWithUpperCaseLetters() throws Exception {		
		assertTrue(Anagrams.isAnagrams(STRING_1, STRING_4));		
	}
	
	@Test
	public void testStringsWithDifferentLengthAndGetException() {
		try {
			Anagrams.isAnagrams(STRING_1, STRING_8);
			fail();
		} catch (Exception e) {
			assertThat(e.getMessage(), is("Strings have different length they can’t be anagrams!"));
		}
	}
	
	@Test
	public void testTwoStringsThatAreNotAnagrams() throws Exception {		
		assertFalse(Anagrams.isAnagrams(STRING_1, STRING_6));		
	}
	
	@Test
	public void testStringWithItselfAndGetException() {
		try {
			Anagrams.isAnagrams(STRING_1, STRING_1);
			fail();
		} catch (Exception e) {
			assertThat(e.getMessage(), is("String1 and String2 is the same! Letters are not rearranged."));
		}
	}

}
