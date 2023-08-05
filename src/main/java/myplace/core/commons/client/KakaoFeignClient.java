package myplace.core.commons.client;

import myplace.core.commons.dto.KakaoResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "kakaoClient", url = "https://dapi.kakao.com")
public interface KakaoFeignClient {

    @GetMapping("/v2/local/search/address.json")
    KakaoResponseDto findPlacesByAddress(@RequestHeader("Authorization") String apiKey,
                                          @RequestParam("query") String query);

    @GetMapping("/v2/local/search/category.json")
    KakaoResponseDto findPlacesByCategory(@RequestHeader("Authorization") String apiKey,
                                          @RequestParam("category_group_code") String categoryGroupCode,
                                          @RequestParam(value = "x", required = false) String x,
                                          @RequestParam(value = "y", required = false) String y,
                                          @RequestParam(value = "radius", required = false) Long radius);

    @GetMapping("v2/local/search/keyword.json")
    KakaoResponseDto findPlacesByKeyword(@RequestHeader("Authorization") String apiKey,
                                         @RequestParam("category_group_code") String categoryGroupCode,
                                         @RequestParam(value = "x", required = false) String x,
                                         @RequestParam(value = "y", required = false) String y,
                                         @RequestParam(value = "radius", required = false) Long radius);
}
