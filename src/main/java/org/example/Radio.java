package org.example;

public class Radio {
    private int stationNumber;
    private int currentStationNumber;
    private int volume;
    private int currentVolume;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }
    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < 0 || newCurrentStationNumber > 9) {
            return;
        } else {
            currentStationNumber = newCurrentStationNumber;
        }
    }

    public void next() {
        if (currentStationNumber < 9) {
            currentStationNumber = currentStationNumber + 1;
        }
        if (currentStationNumber == 9) {
            return;
        }
    }
    public void prev() {
        if (currentStationNumber > 0) {
            currentStationNumber = currentStationNumber - 1;
        }
        if (currentStationNumber == 0) {
            return;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        } else if (newCurrentVolume > 10) {
            return;
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public void nextVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
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
