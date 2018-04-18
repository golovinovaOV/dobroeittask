package com.holovinova.Lambda;

public class TestStringCounter {

	public static void main(String[] args) {

		StringCounter stringCounter = (strings) -> {
			int characterCounter = 0;
			// if strings parameter equals to null return 0
			if (strings == null) {
				return characterCounter;
			}
			// go through all strings and count characters
			for (String string : strings) {
				if (string != null) {
					characterCounter += string.length();
				}
			}
			return characterCounter;
		};

		System.out.println("In these strings "
				+ stringCounter.countCharacters(new String[] { "Hello", "there", "are", "few", "strings", "here" })
				+ " characters.");
	}

}
