package guru.qa.qaguru_basic_add_lesson_custom_spring_api_service.controller;

import guru.qa.qaguru_basic_add_lesson_custom_spring_api_service.domain.LoginInfo;
import guru.qa.qaguru_basic_add_lesson_custom_spring_api_service.domain.UserInfo;
import guru.qa.qaguru_basic_add_lesson_custom_spring_api_service.exception.InvalidUserNameException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class BankController {

    @PostMapping("user/login")
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
