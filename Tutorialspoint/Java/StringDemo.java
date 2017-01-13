public class StringDemo {

	public static void main(String args[]) {
		char helloArray[] = { 'h','e','l','l','o','.' };
		String helloString = new String(helloArray);
		System.out.println( helloString );

		String palindrome = "Dot saw I was Tod";
		int len = palindrome.length();
		System.out.println("String length is : " + len);

		String string1 = "saw I was ";
		System.out.println("Dot ".concat(string1).concat("Tod"));
	}
}
