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
    @GeneratedValue
    @Column(name = "place_id")
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

    public Place(Long id, String placeName, String addressName, String roadAddressName, String placeUrl, String phone, String categoryGroupName, double x, double y) {
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
}
