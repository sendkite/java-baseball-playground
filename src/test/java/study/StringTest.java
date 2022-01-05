package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] actual = "1".split(",");
        assertThat(actual).contains("1"); // 배열에 없는 값이 들어올 경우만 fail
        String[] values = "1,2".split(",");
        assertThat(values).containsExactly("1", "2"); // 원소가 정확이 일치하는지 확인, 순서가 달라도 fail
    }

    @Test
    void substring() {
        String cut = "(1,2)".substring(1, 4); // 원하는 문자열만 출력하게 할수 있는 함수 (시작, 끝) 인자로 범위
        assertThat(cut).isEqualTo("1,2");
    }

    @Test  // 단위 테스트를 위한 어노테이션
    @DisplayName("특정 위치 문자 가져오가") // 테스트를 명시해주는 어노테이션
    void charTest() {
        String str = "abc";
        int index = 2; // 배열 길이는 3이 나온다

        assertThatThrownBy(() -> str.charAt(index))
                .isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("Index: 2, Size: 2");
    }
}
