package com.example.rv_custom.models;

public class trip {
    private int tripimage;
    private String triptitle, trip;

    public trip(int tripimage, String triptitle, String trip) {
        this.tripimage = tripimage;
        this.triptitle = triptitle;
        this.trip = trip;
    }

    public int getTripimage() {
        return tripimage;
    }


    public String getTriptitle() {
        return triptitle;
    }



    public String getTrip() {
        return trip;
    }

}
