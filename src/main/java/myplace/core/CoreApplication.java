package myplace.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@PropertySource("file:C:/Users/finge/IdeaProjects/core/MyPlaceSecurity/application.properties")
@EnableJpaAuditing
@SpringBootApplication
@PropertySource(value = "file:MyPlaceAuth/application.properties")
public class CoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }

}
