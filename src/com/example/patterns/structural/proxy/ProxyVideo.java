package com.example.patterns.structural.proxy;

public class ProxyVideo implements Video{
    private String videoFile;
    RealVideo realVideo;

    public ProxyVideo(String videoFile) {
        this.videoFile = videoFile;
    }

    @Override
    public void watch() {
        loadVideo(videoFile);
        System.out.println("Watch " + videoFile);
    }

    private void loadVideo(String videoFile){
        if(realVideo == null){
            realVideo = new RealVideo(videoFile);
        }
    }
}
