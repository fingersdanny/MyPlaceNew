package myplace.core.commons.controller;

import myplace.core.commons.service.KakaoFeignService;
import myplace.core.place.dto.PlaceSaveDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/search")
public class KakaoFeignController {
    private KakaoFeignService kakaoFeignService;
    @Autowired
    public KakaoFeignController(KakaoFeignService kakaoFeignService) {
        this.kakaoFeignService = kakaoFeignService;
    }

    @GetMapping("/result")
    public String list(Model model, String query) {
        List<PlaceSaveDto> places = kakaoFeignService.findPlacesByQuery(query);
        model.addAttribute("places", places);
        return "search/searchList";
    }
}
