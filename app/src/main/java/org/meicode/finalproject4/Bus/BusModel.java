package org.meicode.finalproject4.Bus;

public class BusModel {
    int imageBus;
    String nameBus, typeBus, seatBus;

    public BusModel(int imageBus, String nameBus, String typeBus, String seatBus) {
        this.imageBus = imageBus;
        this.nameBus = nameBus;
        this.typeBus = typeBus;
        this.seatBus = seatBus;
    }

    public int getImageBus() {
        return imageBus;
    }

    public void setImageBus(int imageBus) {
        this.imageBus = imageBus;
    }

    public String getSeatBus() {
        return seatBus;
    }

    public void setSeatBus(String seatBus) {
        this.seatBus = seatBus;
    }

    public String getNameBus() {
        return nameBus;
    }

    public void setNameBus(String nameBus) {
        this.nameBus = nameBus;
    }

    public String getTypeBus() {
        return typeBus;
    }

    public void setTypeBus(String typeBus) {
        this.typeBus = typeBus;
    }
}
