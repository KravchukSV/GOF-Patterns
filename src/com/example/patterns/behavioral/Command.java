package com.example.patterns.behavioral;

import com.example.patterns.behavioral.command.PlayVideo;
import com.example.patterns.behavioral.command.StopVideo;
import com.example.patterns.behavioral.command.User;
import com.example.patterns.behavioral.command.VideoPlayer;

public class Command {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();

        PlayVideo playVideo = new PlayVideo(videoPlayer);
        StopVideo stopVideo = new StopVideo(videoPlayer);

        User user = new User();
        user.register("play", playVideo);
        user.register("stop", stopVideo);

        user.execute("play");
        System.out.println();
        user.execute("stop");
    }
}
