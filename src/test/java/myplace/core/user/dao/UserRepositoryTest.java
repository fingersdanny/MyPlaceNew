package myplace.core.user.dao;

import myplace.core.user.domain.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;


    @Test
    @DisplayName("유저 생성 확인")
    public void create_user() {
        String name = "daniel";
        String email = "kbry12@naver.com";

        userRepository.save(User.builder()
                .id(1L)
                .username("dkinda")
                .name(name)
                .email(email)
                .password("1234")
                .build());

        List<User> userList = userRepository.findDistinctUserByEmailAndName(email, name);
        User user = userList.get(0);
        assertThat(user.getName()).isEqualTo("daniel");
        assertThat(user.getEmail()).isEqualTo("kbry12@naver.com");
    }
}
