package com.jtf.junit5.beans;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenOrOddTest {

	@ParameterizedTest
	@CsvFileSource(resources = "/src/test/resources/data.csv", numLinesToSkip = 1)
	void evenOrOddTest(String input, String expected) {
		System.out.println(input);
		EvenOrOdd eoo = new EvenOrOdd();
		String actual = eoo.evenOrOddNum(Integer.parseInt(input));
		assertEquals(expected, actual);
	}
//
//	@ParameterizedTest
//	@ValueSource(strings = { "12", "14", "15", "11", "10", "120" })
//	// @CsvFileSource(resources = "/data.csv",numLinesToSkip = 1)
//	public void evenOrOddTest1(String input) {
//		System.out.println(input);
//		EvenOrOdd eoo = new EvenOrOdd();
//		String actual = eoo.evenOrOddNum(Integer.parseInt(input));
//		assertEquals("even", actual);
//	}

}
