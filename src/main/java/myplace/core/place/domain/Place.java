package myplace.core.place.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Table(name = "places")
public class Place {
    @Id
    @Column(name = "place_id")
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

    @Builder
    public Place(Long id, String placeName, String categoryName, String categoryGroupCode, String categoryGroupName, String phone, String addressName, String roadAddressName, String x, String y, String placeUrl, String distance) {
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
}
