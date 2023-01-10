package ru.kremenia.structural.adapter;

public interface TvAction {

    void on();
    void off();
    void upVolume();
    void downVolume();
    void nextChannel();
    void previousChannel();
    void chanel(int ch);

}
