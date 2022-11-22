package _HW1;

public class Main {

	public static void main(String[] args) {
		
		byte a = 100;
		short b = 10000;
		int c = 10000;
		long d = 1000000L;
		char e = 'e';
		float f = 10.1E8F;
		double g = 10.1E8;
		boolean h = true;

		System.out.println("Byte: -128 to 127");
		System.out.println("Short: -32768 to 32767");
		System.out.println("Int: -2147483648 to 2147483647");
		System.out.println("Long: -9223372036854775808L to 9223372036854775807L");
		System.out.println("Float: 1.4e-45f to 3.4e+38f");
		System.out.println("Double: 4.9e-324 to 1.7e+308");
		
		System.out.println();
		
		System.out.println("Byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
		System.out.println("Short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
		System.out.println("Int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
		System.out.println("Long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
		System.out.println("Float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
		System.out.println("Double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
		
		System.out.println();
		
		int [] arr = {35,52,13,70,8,61,22,40,91,11};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if (max < arr[i])
			{
			max = arr[i];				
			}
			if (min > arr[i])
			{
			min = arr[i];				
			}
		}
		
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}	
		
}
