package my.test;

public class StringTest {

	public static void main(String [] args){
		reverseString("HIPPO");
	}
	
	public static void reverseString(String str){
		int len = str.length();
		char[] charArray = new char[len];
		for (int i = len, j = 0; i > 0; i--, j++){
			charArray[j] = str.charAt(i-1);
		}
		System.out.println("Original String = " + str + "   ReverseString = " + charArray.toString());
	}
}
