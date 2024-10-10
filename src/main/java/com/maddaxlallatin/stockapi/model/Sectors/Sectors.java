package com.maddaxlallatin.stockapi.model.Sectors;

import java.util.ArrayList;

public class Sectors {
    ArrayList<SingleSector> sectors;

    public Sectors(ArrayList<SingleSector> sectors) {
        this.sectors = sectors;
    }

    public ArrayList<SingleSector> getSectors() {
        return sectors;
    }

    public void setSectors(ArrayList<SingleSector> sectors) {
        this.sectors = sectors;
    }
}
