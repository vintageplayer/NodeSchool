public class SwappingExample {

	public static void main(String args[]) {
		int a = 30;
		int b = 45;
		System.out.println("Before swapping, a = " + a + " and b = " + b);

		swapFunction(a,b);
		System.out.println("\n** Now, Before and After values will be same here : **");
		System.out.println("After swapping, a = " + a + " and b = " + b);
	}

	public static void swapFunction(int a, int b) {
		System.out.println("Before swapping(Inside), a = " + a + " and b = " + b);

		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping(Inside), a = " + a + " and b = " + b);
	}
}
