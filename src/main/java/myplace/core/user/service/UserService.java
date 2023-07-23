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
@Transactional
public class UserService {
    private UserRepository userRepository;


    public Long saveUser(UserDto userDto) {
        return userRepository.save(userDto.toEntity()).getId();
    }

    public List<User> findUsers() {
        return userRepository.findAll();
    }
}
