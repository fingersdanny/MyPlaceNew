package myplace.core.user.service;

import lombok.AllArgsConstructor;
import myplace.core.user.dto.UserDto;
import myplace.core.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class UserService {
    private UserRepository userRepository;

    @Transactional
    public Long saveUser(UserDto userDto) {
        return userRepository.save(userDto.toEntity()).getId();
    }
}
