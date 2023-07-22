package myplace.core.user.dto;

import lombok.*;
import myplace.core.user.domain.User;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDto {
    private Long id;
    @Size(min = 3, max = 25)
    @NotEmpty(message = "이름은 필수항목입니다.")
    private String name;

    @NotEmpty(message = "닉네임은 필수항목입니다.")
    private String username;

    @NotEmpty(message = "비밀번호는 필수항목입니다.")
    private String password;

    @NotEmpty(message = "이메일은 필수항목입니다.")
    private String email;

    @Builder
    public UserDto(Long id, String name, String username, String password, String email, Date createdAt) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User toEntity() {
        User user = User.builder()
                .id(id)
                .name(name)
                .username(username)
                .password(password)
                .email(email)
                .build();
        return user;
    }
}
