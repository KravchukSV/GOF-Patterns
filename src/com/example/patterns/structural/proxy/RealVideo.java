package com.example.patterns.structural.proxy;

public class RealVideo implements Video{
    private String videoFile;

    public RealVideo(String videoFile) {
        this.videoFile = videoFile;
        loadVideo(videoFile);
    }

    private void loadVideo(String videoFile){
        System.out.println("Load " + videoFile);
    }

    @Override
    public void watch() {
        System.out.println("Watch " + videoFile);
    }
}
