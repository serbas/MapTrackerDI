package demo.apps.maptracker.common;

import com.google.android.gms.maps.model.LatLng;

public class Segment {
    public LatLng start;
    public LatLng finish;
    public double lengthInMeters;

    public Segment(LatLng start, LatLng finish, double len) {
        this.start = start;
        this.finish = finish;
        this.lengthInMeters = len;
    }
}