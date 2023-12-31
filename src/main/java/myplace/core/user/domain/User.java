package myplace.core.user.domain;

import lombok.*;
import myplace.core.commons.domain.TimeEntity;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
@Builder
@Table(name = "users")
public class User extends TimeEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(unique = true)
    private String username;

    private String password;

    @Column(unique = true)
    private String email;


    @Builder
    public User(Long id, String name, String username, String password, String email) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
