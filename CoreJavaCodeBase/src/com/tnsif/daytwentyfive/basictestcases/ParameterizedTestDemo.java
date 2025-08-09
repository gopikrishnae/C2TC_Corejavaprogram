package com.tnsif.daytwentyfive.basictestcases;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {
	void testPalindromes(String word) {
		assertTrue(word.equals(new StringBuffer(word).reverse().toString()));
	}
}
