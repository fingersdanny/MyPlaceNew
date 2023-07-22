package myplace.core.user.service;

import lombok.AllArgsConstructor;
import myplace.core.user.domain.User;
import myplace.core.user.dto.UserDto;
import myplace.core.user.dao.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@AllArgsConstructor
@Service
public class UserService {
    private UserRepository userRepository;

    @Transactional
    public Long saveUser(UserDto userDto) {
        return userRepository.save(userDto.toEntity()).getId();
    }

    public List<User> findUsers() {
        return userRepository.findAll();
    }
}
