package guru.qa.qaguru_basic_add_lesson_custom_spring_api_service.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginInfo {
    private String userName;
    private String password;
}
