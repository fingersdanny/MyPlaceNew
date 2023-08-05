package myplace.core.commons.controller;

import myplace.core.commons.client.KakaoFeignClient;
import myplace.core.commons.dto.KakaoResponseDto;
import myplace.core.commons.dto.PlaceSearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/search")
public class KakaoFeignController {
    @Value("${kakao-admin-key}")
    private String apiKey;

    @Autowired
    KakaoFeignClient kakaoFeignClient;

    @GetMapping("/result")
    public String list(Model model) {
        String query = "PM9";
        String x = "127.06283102249932";
        String y = "37.514322572335935";
        Long radius = 20000L;
        KakaoResponseDto kakaoResponseDto = kakaoFeignClient.findPlacesByCategory(apiKey, query, x, y, radius);
        List<PlaceSearchDto> places = kakaoResponseDto.getDocuments();
        System.out.println(places);

        model.addAttribute("places", places);
        for (int i = 0; i < places.size(); i++) {
            System.out.println(places.get(i).getPlaceName());
        }
        return "commons/searchList";
    }
}
