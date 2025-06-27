package guru.qa.qaguru_basic_add_lesson_custom_spring_api_service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QaguruBasicAddLessonCustomSpringApiServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(QaguruBasicAddLessonCustomSpringApiServiceApplication.class, args);
    }

    @Bean
    public ObjectMapper jacksonMapper(){
        return new ObjectMapper().setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
    }

}
