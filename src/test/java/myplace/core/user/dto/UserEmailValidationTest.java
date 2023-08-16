package myplace.core.user.dto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
@Transactional
public class UserEmailValidationTest {
    private Validator validator;

    @BeforeEach
    void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }
    @Test
    public void 유저_이메일_유효성_검사() throws Exception {
        //given
        String email = "startscream@";


        UserDto userDto = new UserDto();
        userDto.setEmail(email);
        userDto.setName("alex");
        userDto.setUsername("alexy");
        userDto.setPassword("12561gae");

        //when
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);
        System.out.println(violations);

        //then
        assertEquals(1, violations.size());
    }
}
