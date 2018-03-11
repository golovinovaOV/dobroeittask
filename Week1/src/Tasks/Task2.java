package Tasks;

/*
 * Создать переменную с произвольным символом. 
 * Конвертировать символ в число, и вывести результат на консоль.
 * */
public class Task2 {

	public static void main(String[] args) {
		// I choose character "k"
		char character = 'k';
		System.out.println("The number \"" + Character.getNumericValue(character) + "\" matches the character \""+character+"\"");

	}

}
