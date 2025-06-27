package guru.qa.qaguru_basic_add_lesson_custom_spring_api_service.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class UserInfo {
    private Date loginDate;
    private String userName;
}
