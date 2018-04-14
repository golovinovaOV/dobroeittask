package com.holovinova.Task2;

import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

public class TestStringCounter {
	
	@Test
	public void testUniqueCharaters() {
		Assert.assertEquals(4, CharacterCounter.getCountOfUniqueCharacters("abcd"));
		Assert.assertEquals(4, CharacterCounter.getCountOfUniqueCharacters("aabbcccdd"));
		Assert.assertEquals(5, CharacterCounter.getCountOfUniqueCharacters("aabcdde"));
	}
	@Test
	public void testCountEachCharacter() {
		Map<Character, Integer> characterMap = CharacterCounter.getCountOfEachCharacter("acbddcdee");
		Assert.assertEquals(1, characterMap.get('a').intValue());
		Assert.assertEquals(1, characterMap.get('b').intValue());
		Assert.assertEquals(2, characterMap.get('c').intValue());
		Assert.assertEquals(3, characterMap.get('d').intValue());
		Assert.assertEquals(2, characterMap.get('e').intValue());
	}
}
