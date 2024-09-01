package com.exercise.test.order;

class Weather {
    String place;
    Double temperature;

    public Weather() {
    }

    public Weather(String place, Double temperature) {
        this.place = place;
        this.temperature = temperature;
    }

    public Double getTemperature() {
        return temperature;
    }

    public String getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return new StringBuffer("Place : ")
                .append(this.place)
                .append(" Temperature : ")
                .append(this.temperature)
                .toString();
    }
}
