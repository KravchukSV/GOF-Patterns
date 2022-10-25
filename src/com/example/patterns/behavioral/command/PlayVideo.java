package com.example.patterns.behavioral.command;

public class PlayVideo implements VideoCommand{

    VideoPlayer videoPlayer;

    public PlayVideo(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void execute() {
        videoPlayer.playVideo();
    }
}
