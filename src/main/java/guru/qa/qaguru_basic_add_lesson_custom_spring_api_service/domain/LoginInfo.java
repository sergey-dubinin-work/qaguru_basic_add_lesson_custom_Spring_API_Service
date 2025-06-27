package guru.qa.qaguru_basic_add_lesson_custom_spring_api_service.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginInfo {
    private String userName;
    private String password;
}
