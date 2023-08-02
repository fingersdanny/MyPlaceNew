package myplace.core.user.service;

import lombok.AllArgsConstructor;
import myplace.core.user.dao.UserRepository;
import myplace.core.user.domain.User;
import myplace.core.user.dto.UserDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@AllArgsConstructor
@Service
@Transactional
public class UserService {
    private UserRepository userRepository;

    public Long saveUser(UserDto userDto) {
        validateDuplicateUser(userDto.toEntity());
        return userRepository.save(userDto.toEntity()).getId();
    }

    public List<User> findUsers() {
        return userRepository.findAll();
    }

    public void validateDuplicateUser(User user) {
        List<User> findUsers = userRepository.findDistinctUserByEmailAndUsername(user.getEmail(), user.getUsername());
        if (!findUsers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }
    public User findOne(Long userId){
        return userRepository.findDistinctById(userId);}
}
