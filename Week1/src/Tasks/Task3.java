package Tasks;

/*
 * Создать программу, конвертирующую более узкий тип к более широкому.
 * */
public class Task3 {

	public static void main(String[] args) {
		
		byte byteValue = 125;
		//explicit casting
		short shortValue = byteValue;
		//explicit casting
		int intValue = shortValue;
		//explicit casting
		long longValue = intValue;
		
		System.out.println("byte -> short - " + shortValue);
		System.out.println("short -> int - " + shortValue);
		System.out.println("int -> long - " + longValue);
	}

}
