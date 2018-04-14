package com.holovinova.Task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharacterCounter {

	/**
	 * Method counts quantity of unique characters
	 * 
	 * @param inputString
	 * @return quantity of unique characters
	 */
	public static int getCountOfUniqueCharacters(String inputString) {
		Set<Character> setOfCharacter = new HashSet<Character>();
		// convert string to character array
		char[] arrayOfCharacter = inputString.toCharArray();
		// go through all characters and try to add to HashSet
		for (char character : arrayOfCharacter) {
			setOfCharacter.add(character);
		}
		// now set consists of unique characters
		// return size of this set
		return setOfCharacter.size();
	}

	/**
	 * Method counts quantity of each character
	 * 
	 * @param inputString
	 * @return Map<Character, Integer>, key - character, value - quantity of
	 *         particular character
	 */
	public static Map<Character, Integer> getCountOfEachCharacter(String inputString) {
		Map<Character, Integer> characterMap = new HashMap<Character, Integer>();
		// convert string to character array
		char[] arrayOfCharacters = inputString.toCharArray();
		// go through all characters and add to map
		for (char c : arrayOfCharacters) {
			// if element with current key exist - value = value + 1, else value = 1
			if (characterMap.containsKey(c)) {
				characterMap.put(c, characterMap.get(c) + 1);
			} else {
				characterMap.put(c, 1);
			}
		}
		// now map consists of characters as a key and quantity of particular character
		// as value
		return characterMap;
	}
}
