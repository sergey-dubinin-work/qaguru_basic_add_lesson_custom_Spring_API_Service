package guru.qa.qaguru_basic_add_lesson_custom_spring_api_service.controller;

import guru.qa.qaguru_basic_add_lesson_custom_spring_api_service.domain.LoginInfo;
import guru.qa.qaguru_basic_add_lesson_custom_spring_api_service.domain.UserInfo;
import guru.qa.qaguru_basic_add_lesson_custom_spring_api_service.exception.InvalidUserNameException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@Tag(name = "BankController", description = "Bank operations")
public class BankController {

    private final Map<String, UserInfo> users = Map.of(
            "Sergey D", UserInfo.builder().userName("Serega D").build(),
            "Sergey G", UserInfo.builder().userName("Serega G").build()
    );

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

    @GetMapping("/user/getAll")
    @Operation(summary =  "Получение всех юзеров")
    public List<UserInfo> getAllUserInfo(){
        return users.values().stream().toList();
    }


}
