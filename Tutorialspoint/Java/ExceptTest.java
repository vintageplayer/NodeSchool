//import java.io.*;
public class ExceptTest {

	public static void main(String args[]) {
		try {
			int a[] = new int[2];
			System.out.println("Accesing element three : " + a[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown : " + e);
		}
		System.out.println("Out of the block");
	}
}
