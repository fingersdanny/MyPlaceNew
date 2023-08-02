package myplace.core.place.dto;

import lombok.*;
import myplace.core.place.domain.Place;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class PlaceSaveDto {

    private Long id;

    private String placeName;

    private String addressName;
    private String roadAddressName;
    private String placeUrl;

    private String phone;

    private String categoryGroupName;

    private double x;

    private double y;

    @Builder
    public PlaceSaveDto(Long id, String placeName, String addressName, String roadAddressName, String placeUrl, String phone, String categoryGroupName, double x, double y) {
        this.id = id;
        this.placeName = placeName;
        this.addressName = addressName;
        this.roadAddressName = roadAddressName;
        this.placeUrl = placeUrl;
        this.phone = phone;
        this.categoryGroupName = categoryGroupName;
        this.x = x;
        this.y = y;
    }

    public Place toEntity() {
        Place place = Place.builder()
                .id(id)
                .placeName(placeName)
                .addressName(addressName)
                .roadAddressName(roadAddressName)
                .placeUrl(placeUrl)
                .phone(phone)
                .categoryGroupName(categoryGroupName)
                .x(x)
                .y(y)
                .build();

        return place;
    }
}
