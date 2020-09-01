package ru.netology.domain;

public class GeoInfo {
    private String coordinates;
    private String type;

    public String getCoordinates() {
        return coordinates;
    }

    private void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }
    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }
}
