package demotest;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamTest {
@ParameterizedTest
@ValueSource(strings = {"cali","bali"})
void endswith(String str) {
	assertTrue(str.endsWith("i"));
}

}
