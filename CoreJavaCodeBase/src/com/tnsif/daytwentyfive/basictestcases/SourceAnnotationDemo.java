package com.tnsif.daytwentyfive.basictestcases;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

public class SourceAnnotationDemo {

	@DisplayName("Roman numeral")
	private static String[] getWords() {
		String s = "Hello! How are you?";
		return s.split(" ");
	}

}
