package assignment_datatypes;

public class Type_Convertion {

	public static void main(String[] args) {
		System.out.println("Integer");
		int_Convertion(93);
		System.out.println("---------------------");
		System.out.println("Float");
		float_Convertion(100.0f);
		System.out.println("---------------------");
		System.out.println("Double");
		double_Convertion(10.0);
		System.out.println("---------------------");
		System.out.println("Short");
		short_Convertion((short)199);
		System.out.println("---------------------");
		System.out.println("Long");
		long_Convertion(1000);
		System.out.println("---------------------");
		System.out.println("Byte");
		byte_Convertion((byte)19);
		System.out.println("---------------------");
		System.out.println("Character");
		char_Convertion('c');
	}
	static void int_Convertion(int i)
	{
		System.out.println("Integer "+i);
		System.out.println("Short "+(short)i);
		System.out.println("Byte "+(byte)i);
		System.out.println("Long "+(long)i);
		System.out.println("Char "+(char)i);
		System.out.println("Float "+(float)i);
		System.out.println("Double "+(double)i);
	}
	static void float_Convertion(float f)
	{
		System.out.println("Float "+f);
		System.out.println("Short "+(short)f);
		System.out.println("Byte "+(byte)f);
		System.out.println("Long "+(long)f);
		System.out.println("Char "+(char)f);
		System.out.println("Integer "+(int)f);
		System.out.println("Double "+(double)f);
	}
	static void double_Convertion(double d)
	{
		System.out.println("Double "+d);
		System.out.println("Short "+(short)d);
		System.out.println("Byte "+(byte)d);
		System.out.println("Long "+(long)d);
		System.out.println("Char "+(char)d);
		System.out.println("Float "+(float)d);
		System.out.println("Integer "+(int)d);
	}
	static void short_Convertion(short s)
	{
		System.out.println("Short "+s);
		System.out.println("Double "+(double)s);
		System.out.println("Byte "+(byte)s);
		System.out.println("Long "+(long)s);
		System.out.println("Char "+(char)s);
		System.out.println("Float "+(float)s);
		System.out.println("Integer "+(int)s);
	}
	static void long_Convertion(long l)
	{
		System.out.println("Long "+l);
		System.out.println("Double "+(double)l);
		System.out.println("Short "+(short)l);
		System.out.println("Byte "+(byte)l);
		System.out.println("Char "+(char)l);
		System.out.println("Float "+(float)l);
		System.out.println("Integer "+(int)l);
	}
	static void byte_Convertion(byte b)
	{
		System.out.println("Byte "+b);
		System.out.println("Double "+(byte)b);
		System.out.println("Short "+(short)b);
		System.out.println("Long "+(long)b);
		System.out.println("Char "+(char)b);
		System.out.println("Float "+(float)b);
		System.out.println("Integer "+(int)b);
	}
	static void char_Convertion(char c)
	{
		System.out.println("Character "+c);
		System.out.println("Short "+(short)c);
		System.out.println("Byte "+(byte)c);
		System.out.println("Long "+(long)c);
		System.out.println("Double "+(double)c);
		System.out.println("Float "+(float)c);
		System.out.println("Integer "+(int)c);
	}
}
