package com.example.gencgonulluler;

import androidx.appcompat.app.AppCompatActivity;

public class Singleton  {

    private Etkinlikler selectedEtkinlikler;
    private static Singleton singleton;

    private Singleton() {

    }

    public Etkinlikler getSelectedEtkinlikler() {
        return selectedEtkinlikler;
    }

    public void setChosenEtkinlikler(Etkinlikler selectedEtkinlikler) {
        this.selectedEtkinlikler = selectedEtkinlikler;
    }

    public static Singleton getInstance() {

        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;

    }

}
