package myplace.core.place.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {
    private String addressName;
    private String roadAddressName;
    private String placeUrl;

    public Address(String addressName, String roadAddressName, String placeUrl) {
        this.addressName = addressName;
        this.roadAddressName = roadAddressName;
        this.placeUrl = placeUrl;
    }

    protected Address() {}

}
