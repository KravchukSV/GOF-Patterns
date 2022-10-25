package com.example.patterns.structural.decorator;

import java.util.List;

abstract class AdvertisingDecorator implements Advertising{
    protected List<Advertising> advertising;

    public AdvertisingDecorator(List<Advertising> advertising) {
        this.advertising = advertising;
    }

    @Override
    public void advertise() {
        for(Advertising a : advertising){
            a.advertise();
        }
    }
}
