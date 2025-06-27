package guru.qa.qaguru_basic_add_lesson_custom_spring_api_service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class InvalidUserNameException extends RuntimeException {
}
