package myplace.core.place.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import myplace.core.place.domain.Place;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class PlaceSaveDto {
    private Long id;

    private String placeName;

    private String categoryName;

    private String categoryGroupCode;

    private String categoryGroupName;

    private String phone;

    private String addressName;

    private String roadAddressName;

    private String x;

    private String y;

    private String placeUrl;

    private String distance;

    public PlaceSaveDto(Long id, String placeName, String categoryName, String categoryGroupCode, String categoryGroupName, String phone, String addressName, String roadAddressName, String x, String y, String placeUrl, String distance) {
        this.id = id;
        this.placeName = placeName;
        this.categoryName = categoryName;
        this.categoryGroupCode = categoryGroupCode;
        this.categoryGroupName = categoryGroupName;
        this.phone = phone;
        this.addressName = addressName;
        this.roadAddressName = roadAddressName;
        this.x = x;
        this.y = y;
        this.placeUrl = placeUrl;
        this.distance = distance;
    }

    @Builder


    public Place toEntity() {
        Place place = Place.builder()
                .id(id)
                .placeName(placeName)
                .categoryName(categoryName)
                .categoryGroupCode(categoryGroupCode)
                .categoryGroupName(categoryGroupName)
                .phone(phone)
                .addressName(addressName)
                .roadAddressName(roadAddressName)
                .x(x)
                .y(y)
                .placeUrl(placeUrl)
                .distance(distance)
                .build();

        return place;
    }
}
