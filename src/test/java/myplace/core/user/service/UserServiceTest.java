package myplace.core.user.service;

import myplace.core.user.dao.UserRepository;
import myplace.core.user.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
public class UserServiceTest {
    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;

    @Test
    public void 중복회원_검사_이메일_유저닉네임() throws Exception {
        //given
        String email = "asc@goo.com";
        String username = "darkmode";
        UserDto user1 = UserDto.builder().email(email).username(username).build();

        UserDto user2 = UserDto.builder().email(email).username(username).build();
        //when
        userService.saveUser(user1);

        //then
        assertThrows(IllegalStateException.class, () -> {
           userService.saveUser(user2);
        });
    }
}
