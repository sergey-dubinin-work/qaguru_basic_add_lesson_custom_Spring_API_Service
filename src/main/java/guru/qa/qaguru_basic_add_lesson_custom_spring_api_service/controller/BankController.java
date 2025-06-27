package guru.qa.qaguru_basic_add_lesson_custom_spring_api_service.controller;

import guru.qa.qaguru_basic_add_lesson_custom_spring_api_service.domain.LoginInfo;
import guru.qa.qaguru_basic_add_lesson_custom_spring_api_service.domain.UserInfo;
import guru.qa.qaguru_basic_add_lesson_custom_spring_api_service.exception.InvalidUserNameException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Tag(name = "BankController", description = "Bank operations")
public class BankController {

    @PostMapping("user/login")
    @Operation(summary = "Login user")
    public UserInfo doLogin(@RequestBody LoginInfo loginInfo){
        if (loginInfo.getUserName().equals("akado")){
            return UserInfo.builder()
                    .loginDate(new Date())
                    .userName(loginInfo.getUserName())
                    .build();
        } else {
            throw new InvalidUserNameException();
        }

    }

}
