package ru.netology;

public class Radio {
    private int firstStation = 0;
    private int lastStation = 9;
    private int numberStation = 10;
    private int firstVolume = 0;
    private int lastVolume = 100;

    private int currentStation;
    private int currentVolume;

    public Radio(int numberStation) {
        this.numberStation = numberStation;
        this.firstStation = 0;
        this.lastStation = numberStation - 1;
    }

    public Radio() {
    }

    public int getNumberStation() {
        return numberStation;
    }

    public int getLastStation() {
        return lastStation;
    }

    public int getFirstStation() {
        return firstStation;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < firstStation) {
            return;
        }
        if (newCurrentStation > lastStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        int target = currentStation + 1;
        if (currentStation == lastStation) {
            target = firstStation;
        }
        setCurrentStation(target);
    }

    public void prev() {
        int target = currentStation - 1;
        if (currentStation == firstStation) {
            target = lastStation;
        }
        setCurrentStation(target);
    }

    public void setCurrentVolume(int newCurrentVolume) {

        currentVolume = newCurrentVolume;
    }

    public void turnUpVolume() {
        if ((currentVolume >= firstVolume) && (currentVolume < lastVolume)) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= lastVolume) {
            currentVolume = lastVolume;
        }
        if (currentVolume < firstVolume) {
            currentVolume = firstVolume;
        }
    }

    public void turnDownVolume() {
        if ((currentVolume > firstVolume) && (currentVolume <= lastVolume)) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume > lastVolume) {
            currentVolume = lastVolume;
        }
        if (currentVolume <= firstVolume) {
            currentVolume = firstVolume;
        }
    }
}
