public class  UnderscoreLiteralsExample
{
	public static void main(String[] args) {

		byte a = (byte) 0b10_10_10_10;
		short b = (short) 45_54;
		int c = 123_456_789;
		long d = 111_222_333L;
		float e = 11.22_77_99F;

		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		System.out.println("e = "+e);
	}
}
