package myplace.core.commons;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AdminKey {
    @Value("${kakao-admin-key}")
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }

    @Override
    public String toString() {
        return "Apikey = " + apiKey;
    }
}
