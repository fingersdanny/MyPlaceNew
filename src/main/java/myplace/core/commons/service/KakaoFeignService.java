package myplace.core.commons.service;

import lombok.RequiredArgsConstructor;
import myplace.core.commons.client.KakaoFeignClient;
import myplace.core.place.dto.PlaceSaveDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class KakaoFeignService {
    @Value("${kakao-admin-key}")
    private String adminKey;
    @Autowired
    private KakaoFeignClient kakaoFeignClient;
    private final String apiKey = "KakaoAK" + adminKey;


    public List<PlaceSaveDto> findPlacesByQuery(String query) {
        return kakaoFeignClient.findPlacesByQuery(apiKey, query);
    }
}
