package myplace.core.commons.client;

import myplace.core.place.dto.PlaceSaveDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "kakaoClient", url = "https://dapi.kakao.com")
public interface KakaoFeignClient {

    //@PathVariable을 통해 가변 경로 설정 가능
    @GetMapping("/v2/local/search/category.json")
    List<PlaceSaveDto> findPlacesByQuery(@RequestHeader(value = "Authorization") String authorizationHeader,
                                         @RequestParam(value = "category_group_code") String categoryGroupCode);

}
