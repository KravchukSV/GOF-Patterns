package com.example.patterns.structural.decorator;

import java.util.List;

public class GlobalAdvertising extends AdvertisingDecorator{
    public GlobalAdvertising(List<Advertising> advertising) {
        super(advertising);
    }

    @Override
    public void advertise() {
        System.out.println("GLOBAL ADVERTISING");
        super.advertise();
    }
}
