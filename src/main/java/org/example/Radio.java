package org.example;

public class Radio {
    private int currentStationNumber;
    private int currentVolume;
    private int stationQuantity = 10;

    public Radio (int stationQuantity) {
        this.stationQuantity = stationQuantity;
    }
    public Radio () {

    }
    public int getCurrentStationNumber() {
        return currentStationNumber;
    }
    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < 0 || newCurrentStationNumber > stationQuantity - 1) {
            return;
        } else {
            currentStationNumber = newCurrentStationNumber;
        }
    }
    public void next() {
        if (currentStationNumber == stationQuantity - 1) {
            currentStationNumber = 0;
        }
        else {
            currentStationNumber = currentStationNumber + 1;
        }
    }
    public void prev() {
        if (currentStationNumber == 0) {
            currentStationNumber = stationQuantity - 1;
        } else {
            currentStationNumber = currentStationNumber - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        } else if (newCurrentVolume > 100) {
            return;
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public void nextVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 100) {
            return;
        }
    }
    public void prevVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            return;
        }
    }

}
