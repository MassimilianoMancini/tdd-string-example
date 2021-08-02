package string.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests of Left Trim String Utils")
class MyStringUtilsTest {
	
	private MyStringUtils myStringUtils;

	@BeforeEach
	void setup() {
		myStringUtils = new MyStringUtils();
		
	}

	@Test
	@DisplayName("Null case")
	void testLeftTrimWithNullString() {
		assertThat(myStringUtils.leftTrim(null)).isNull();
	}
	
	@Test
	@DisplayName("Empty string case")
	void testLeftTrimWithEmptyString() {
		assertThat(myStringUtils.leftTrim("")).isEmpty();
	}
	
	@Test
	@DisplayName("One leading space case")
	void testLeftTrimWithOneLeadingSpace() {
		assertThat(myStringUtils.leftTrim(" abc")).isEqualTo("abc");
	}
	
	@Test
	@DisplayName("No leading space case")
	void testLeftTrimWithNoLeadingSpace() {
		assertThat(myStringUtils.leftTrim("abc")).isEqualTo("abc");
	}
	
	@Test
	@DisplayName("One leading tab case")
	void testLeftTrimWithOneLeadingTab() {
		assertThat(myStringUtils.leftTrim("\tabc")).isEqualTo("abc");
	}
	
	@Test
	@DisplayName("Several leading spaces case")
	void testLeftTrimWithSeveralLeadingSpaces() {
		assertThat(myStringUtils.leftTrim("   abc")).isEqualTo("abc");
	}
	
	@Test
	@DisplayName("All spaces case")
	void testLeftTrimWithAllSpaces() {
		assertThat(myStringUtils.leftTrim("   ")).isEmpty();
	}

}
