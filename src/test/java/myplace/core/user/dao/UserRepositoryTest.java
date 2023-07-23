package myplace.core.user.dao;

import myplace.core.user.domain.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Transactional
    @Test
    @DisplayName("유저 생성 확인")
    public void create_user() {
        Long datetime = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(datetime);
        userRepository.save(User.builder()
                .id(1L)
                .username("dkinda")
                .name("daniel")
                .email("kbry12@naver.com")
                .password("1234")
                .build());

        List<User> userList = userRepository.findAll();

        User user = userList.get(0);
        assertThat(user.getName()).isEqualTo("daniel");
        assertThat(user.getEmail()).isEqualTo("kbry12@naver.com");
    }
}
