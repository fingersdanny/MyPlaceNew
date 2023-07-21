package myplace.core.user.dto;

import lombok.*;
import myplace.core.user.domain.User;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String name;
    private String username;
    private String password;
    private String email;
    private Date createdAt;

    @Builder
    public UserDto(Long id, String name, String username, String password, String email, Date createdAt) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.createdAt = createdAt;
    }

    public User toEntity() {
        User user = User.builder()
                .id(id)
                .name(name)
                .username(username)
                .password(password)
                .email(email)
                .createdAt(createdAt)
                .build();
        return user;
    }
}
