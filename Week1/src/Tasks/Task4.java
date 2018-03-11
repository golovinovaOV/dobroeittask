package Tasks;

public class Task4 {
	public static void main(String[] args) {

		int intValue = 12587;
		double doubleValue = 12.5;
		//implicit casting
		//here we don't loose data 
		short shortValue = (short)intValue;
		//implicit casting
		//here we loose data
		byte byteValue = (byte)shortValue;
		//implicit casting
		//here we loose data
		intValue = (int)doubleValue;
				
		System.out.println("int -> short - " + shortValue);
		System.out.println("(here we loose data) short -> byte - " + byteValue);
		System.out.println("(here we loose data) double -> int - " + intValue);
	}

}
