package myplace.core.user.dto;

import lombok.*;
import myplace.core.commons.domain.TimeEntity;
import myplace.core.user.domain.User;

import javax.validation.constraints.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDto extends TimeEntity {
    private Long id;
    @NotBlank(message = "이름은 필수항목입니다.")
    private String name;

    @Size(min = 4, message = "닉네임은 4글자 이상이어야 합니다")
    @NotBlank(message = "닉네임은 필수항목입니다.")
    private String username;

    @NotBlank(message = "비밀번호는 필수항목입니다.")
    @Size(min = 8, max = 20, message = "비밀번호는 8자리 이상이어야 합니다.")
    private String password;

    @Email
    @NotBlank(message = "이메일은 필수항목입니다.")
    private String email;

    @Builder
    public UserDto(Long id, String name, String username, String password, String email) {
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
