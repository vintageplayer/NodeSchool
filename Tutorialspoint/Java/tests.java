public class tests {
	public static void main(String args[]) {
		int mask = 0b11111111111111;
		System.out.println(mask);
		int temp = mask;
		int x = 500;
		while(temp > x)
		{
			temp = temp>>>1;
			System.out.println(temp);
		}
	}
}
