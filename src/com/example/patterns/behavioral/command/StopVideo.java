package com.example.patterns.behavioral.command;

public class StopVideo implements VideoCommand{

    VideoPlayer videoPlayer;

    public StopVideo(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void execute() {
        videoPlayer.stopVideo();
    }
}
