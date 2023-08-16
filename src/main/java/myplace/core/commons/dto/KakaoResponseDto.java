package myplace.core.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class KakaoResponseDto {
    private Meta meta;
    public List<PlaceSearchDto> documents;

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Meta {
        private Long totalCount;
        private Long pageableCount;
        private boolean isEnd;
    }
}
