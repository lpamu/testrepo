package my.review;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFunctionTest {

	public static void main(String[] args) {
		System.out.println("Is Kayakakayak PalindromeString:  "
				+ isPalindromeString("Kayakakayak"));

		System.out.println("Is KPalindrome PalindromSetring:  "
				+ isPalindromeString("Palindrome"));

		regularExpTest();
		compareTo();
		subSequence();
		splitString();
		stringToCharArray();
	}
	
	public static void regularExpTest(){ //http://www.journaldev.com/634/java-regular-expression-tutorial-with-examples
	String str = "bbb"; 
	System.out.println("Using String matches method: " + str.matches(".bb"));
	System.out.println("Using Pattern matches method: " + Pattern.matches(".bb", str));
	
    // using pattern with flags         
	Pattern pattern = Pattern.compile("ab", Pattern.CASE_INSENSITIVE);       
	Matcher matcher = pattern.matcher("ABcabdAb");         // using Matcher find(), group(), start() and end() methods        
	while (matcher.find()) {             
		System.out.println("Found the text \"" + matcher.group()                     + "\" starting at " + matcher.start()                     + " index and ending at index " + matcher.end());         }          
	// using Pattern split() method        
	pattern = Pattern.compile("\\W");         
	String[] words = pattern.split("one@two#three:four$five");        
	for (String s : words) {             
		System.out.println("Split using Pattern.split(): " + s);         }           
	// using Matcher.replaceFirst() and replaceAll() methods         
	pattern = Pattern.compile("1*2");         
	matcher = pattern.matcher("11234512678");        
	System.out.println("Using replaceAll: " + matcher.replaceAll("_"));        
	System.out.println("Using replaceFirst: " + matcher.replaceFirst("_"));     
	}
	
	private static boolean isPalindromeString(String str) {
		if (str == null)
			return false;
		int length = str.length();
		System.out.println(length / 2);
		for (int i = 0; i < length / 2; i++) {
			if (str.charAt(i) != str.charAt(length - i - 1))
				return false;
		}
		return true;
	}

	private static String removeChar(String str, char c) {
		if (str == null)
			return null;
		return str.replaceAll(Character.toString(c), "");
	}

	public static void compareTo() {
		String str = "ABC";
		System.out.println("Compare DEF and ABC: " + str.compareTo("DEF"));
		System.out.println("Compare ABC and abc: "
				+ str.compareToIgnoreCase("abc"));
		String s = "ABCOnline";
		String sub = s.substring(0,3);
		System.out.println("sub = " + sub);
		System.out.println("str == sub: " + (str == sub));
		System.out.println("str == ABC: " + (str == "ABC"));
		System.out.println("str.equals(s): " + (str.equals(s)));

		// The function equals, checks the actual contents of the string, the ==
		// operator checks whether the references to the objects are equal.
		String usuario = "Jorman";
		
		String strDatos = "Jorman 14988611";
		StringTokenizer tokens = new StringTokenizer(strDatos, " ");
		int nDatos = tokens.countTokens();
		String[] datos = new String[nDatos];
		int i = 0;

		while (tokens.hasMoreTokens()) {
			String str1 = tokens.nextToken();
			datos[i] = str1;
			i++;
		}

		System.out.println ("datos : " + datos[0] + " " + datos [1]);

		if ((datos[0] == usuario)) {
			System.out.println("WORKING");
		}
		
		String s1 = "Hello"; 
		String s2 = new String(s1); 
		System.out.println(s1 + " equals " + s2 + " -> " + 
		s1.equals(s2)); 
		System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2)); 

	}

	public static void subSequence() {
		String str = "www.journaldev.com";
		System.out.println("Last 4 char String: "
				+ str.subSequence(str.length() - 4, str.length()));
		System.out.println("First 4 char String: " + str.subSequence(0, 4));
		System.out.println("website name: " + str.subSequence(4, 14));

		// substring vs subSequence
		System.out.println("substring == subSequence ? "
				+ (str.substring(4, 14) == str.subSequence(4, 14)));
		System.out.println("substring equals subSequence ? "
				+ (str.substring(4, 14).equals(str.subSequence(4, 14))));
	}

	public static void splitString() {
		String line = "I am a java developer";
		String[] words = line.split(" ");
		String[] twoWords = line.split(" ", 2);
		System.out.println("String split with delimiter: "
				+ Arrays.toString(words));
		System.out.println("String split into two: "
				+ Arrays.toString(twoWords));

		// split string delimited with special characters
		String wordsWithNumbers = "I|am|a|java|developer";
		String[] numbers = wordsWithNumbers.split("\\|");
		System.out.println("String split with special character: "
				+ Arrays.toString(numbers));

	}

	public static void stringToCharArray() {
		String str = "journaldev.com";
		char[] charArr = str.toCharArray(); // print the char[] elements
		System.out.println("String converted to char array: "
				+ Arrays.toString(charArr)); // let's convert char[] to String
												// now
		String str1 = new String(charArr);
		System.out.println("char array converted to String: " + str1);
		System.out.println("str == str1? " + (str == str1));
		System.out.println("str.equals(str1)? " + (str.equals(str1)));
	}
}
