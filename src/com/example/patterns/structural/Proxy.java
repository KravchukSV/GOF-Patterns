package com.example.patterns.structural;

import com.example.patterns.structural.proxy.ProxyVideo;
import com.example.patterns.structural.proxy.RealVideo;
import com.example.patterns.structural.proxy.Video;

public class Proxy {
    public static void main(String[] arg){

        String videoFile = "proxy.mp4";

        Video realVideo = new RealVideo(videoFile);
        System.out.println();
        realVideo.watch();

        System.out.println("\nProxyVideo");

        Video proxyVideo = new ProxyVideo(videoFile);
        System.out.println();
        proxyVideo.watch();
    }
}
