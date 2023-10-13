package hello.login.domain.member;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class Member {

    private Long id;
    @NotEmpty
    private String loginId;  // 로그인 ID
    @NotEmpty
    private String name; // 사용자 이름
    @NotEmpty
//    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[!@#$%^&*+=])[a-zA-Z\\d!@#$%^&*+=]{10,20}$")
    private String password;
}
