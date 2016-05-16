public class BinaryLiteralsExample {

	public static void main(String[] args) {
		
		byte a = (byte) 0b10101000;
		short b = (short) 0b1110000;
		int c = (int) 0B1001001;
		long d = 0b10110111011;

		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);

	}
}
