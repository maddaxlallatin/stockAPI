package com.maddaxlallatin.stockapi.model.Sectors;

public class SingleSector {
    private String sectorName;
    private String marketWeight;
    private String ytdReturn;

    public SingleSector(String sectorName, String marketWeight, String ytdReturn) {
        this.sectorName = sectorName;
        this.marketWeight = marketWeight;
        this.ytdReturn = ytdReturn;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public String getMarketWeight() {
        return marketWeight;
    }

    public void setMarketWeight(String marketWeight) {
        this.marketWeight = marketWeight;
    }

    public String getYtdReturn() {
        return ytdReturn;
    }

    public void setYtdReturn(String ytdReturn) {
        this.ytdReturn = ytdReturn;
    }
}
