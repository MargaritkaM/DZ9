package ru.netology;

public class Radio {
    private int firstStation = 0;
    private int lastStation = 9;
    private int numberStation = 10;
    private int currentStation;
    private int currentVolume;

    public Radio (int numberStation){
        this.numberStation=numberStation;
        this.firstStation=0;
        this.lastStation=numberStation-1;
    }

    public Radio (){
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

//    public void setCurrentStation(int newCurrentStation) {
//        if (newCurrentStation < 0) {
//            return;
//        }
//        if (newCurrentStation > 9) {
//            return;
//        }
//        currentStation = newCurrentStation;
//    }
//
//    public void next() {
//        int target = currentStation + 1;
//        if (currentStation == 9) {
//            target = 0;
//        }
//        setCurrentStation(target);
//    }
//
//    public void prev() {
//        int target = currentStation - 1;
//        if (currentStation == 0) {
//            target = 9;
//        }
//        setCurrentStation(target);
//    }
//
//    public void setCurrentVolume(int newCurrentVolume) {
//        //
//        currentVolume = newCurrentVolume;
//    }
//
//    public void turnUpVolume() {
//        if ((currentVolume >= 0) && (currentVolume < 10)) {
//            currentVolume = currentVolume + 1;
//        }
//        if (currentVolume >= 10) {
//            currentVolume = 10;
//        }
//        if (currentVolume < 0) {
//            currentVolume = 0;
//        }
//    }
//
//    public void turnDownVolume() {
//        if ((currentVolume > 0) && (currentVolume <= 10)) {
//            currentVolume = currentVolume - 1;
//        }
//        if (currentVolume > 10) {
//            currentVolume = 10;
//        }
//        if (currentVolume <= 0) {
//            currentVolume = 0;
//        }
//    }
}
