package com.example.gencgonulluler;

import java.io.Serializable;

public class Etkinlikler implements Serializable {

        String name;
        String country;
        int image;

        public Etkinlikler(String name, String country, int image) {
            this.name = name;
            this.country = country;
            this.image = image;
        }


}

