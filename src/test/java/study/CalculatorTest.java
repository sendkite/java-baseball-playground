package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class CalculatorTest {
    String values = "2 + 3 * 4 / 2";
    String[] str = values.split(" ");

    @Test
    void valueChecker() {
        assertThat(str[0]).isEqualTo("2");
        assertThat(str[1]).isEqualTo("+");
        assertThat(str[2]).isEqualTo("3");
    }

    @Test
    void plus() {
        int number1 = Integer.parseInt(str[0]);
        int number2 = Integer.parseInt(str[2]);
        assertThat(number1 + number2).isEqualTo(5);
    }
}
