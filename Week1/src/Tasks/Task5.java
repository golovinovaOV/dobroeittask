package Tasks;
/*
 * Запомнить 8 примитивных типов данных, их свойства и особенности. 
 * Создать по одной переменной каждого типа.
 * */
public class Task5 {

	public static void main(String[] args) {
		//size: 2 bytes 
		char character = 'r';
		//size: 1 bit (although depends on JVM)
		boolean booleanValue = true;
		//size: 1 byte
		byte byteValue = 127;
		//size: 2 bytes
		short shortValue = 24654;
		//size: 4 bytes
		int intValue = 134;
		//size: 8 bytes
		long longValue = 12L;
		//size: 4 bytes
		float floatValue = 12.0F;
		//size: 8 bytes
		double doubleValue = 145.78;
		 
		System.out.println("char - " + character);
		System.out.println("boolean - " + booleanValue);
		System.out.println("byte - " + byteValue);
		System.out.println("short - " + shortValue);
		System.out.println("int - " + intValue);
		System.out.println("long - " + longValue);
		System.out.println("float - " + floatValue);
		System.out.println("double - " + doubleValue);
		
	}

}
