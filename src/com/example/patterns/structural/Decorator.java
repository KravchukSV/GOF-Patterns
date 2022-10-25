package com.example.patterns.structural;

import com.example.patterns.structural.decorator.Advertising;
import com.example.patterns.structural.decorator.GlobalAdvertising;
import com.example.patterns.structural.decorator.RadioAdvertising;
import com.example.patterns.structural.decorator.TvAdvertising;

import java.util.ArrayList;
import java.util.List;

public class Decorator {
    public static void main(String[] arg){
        Advertising tvAdvertising = new TvAdvertising();
        Advertising radioAdvertising = new RadioAdvertising();
        List<Advertising> advertisingList = new ArrayList<>();
        advertisingList.add(tvAdvertising);
        advertisingList.add(radioAdvertising);

        Advertising globalAdvertising = new GlobalAdvertising(advertisingList);

        globalAdvertising.advertise();
    }
}
