package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class ValidationUtilsTest {
    // 1~9의 숫자에서 랜덤 3개 숫자
    @Test
    @DisplayName("1-9 숫자 검증")
    void check_baseball() {
        assertThat(ValidationUtils.validNo(9)).isTrue();
        assertThat(ValidationUtils.validNo(1)).isTrue();
        assertThat(ValidationUtils.validNo(0)).isFalse();
        assertThat(ValidationUtils.validNo(10)).isFalse();
    }

    // 사용자 입력 3개

    // 예외 처리

    // 위치, 숫자 같으면 스트리이트
    // 위치 다른데 숫자 같으면 볼
    // 숫자 값이 다르면 낫띵

    // 사용자 입력에 따른 실행 결과

}