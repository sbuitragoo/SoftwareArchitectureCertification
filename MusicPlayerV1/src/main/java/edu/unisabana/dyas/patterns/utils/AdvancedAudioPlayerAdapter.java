package edu.unisabana.dyas.patterns.utils;

import edu.unisabana.dyas.patterns.utils.AudioPlayer;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;

public class AdvancedAudioPlayerAdapter implements  AudioPlayer {
    private final AdvancedAudioPlayer advancedAudioPlayer;

    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
        this.advancedAudioPlayer = advancedAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("MP4")) {
            this.advancedAudioPlayer.playMp4(fileName);
        } else if (audioType.equals("VLC")) {
            this.advancedAudioPlayer.playVlc(fileName);
        } else {
            System.out.println("Audio Type " + audioType + " not supported");
        }
    }

    @Override
    public void stop() {
        this.advancedAudioPlayer.stop();
    }
}
