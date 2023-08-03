package myplace.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@PropertySource("file:C:/Users/finge/IdeaProjects/core/MyPlaceAuth/application-main.yml")
@PropertySource("file:C:/Users/finge/IdeaProjects/core/MyPlaceAuth/application-API-key.properties")
@EnableJpaAuditing
@EnableFeignClients
@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }

}
