package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayerAdapter;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;

// Cliente que utiliza directamente AdvancedAudioPlayer sin conocer la interfaz AudioPlayer
public class Client {
    public static void main(String[] args) {
        AdvancedAudioPlayer advancedAudioPlayer = new AdvancedAudioPlayer();
        AdvancedAudioPlayerAdapter advancedAudioPlayerAdapter = new AdvancedAudioPlayerAdapter(advancedAudioPlayer);

        advancedAudioPlayerAdapter.play("MP4", "Song.mp4");
        advancedAudioPlayerAdapter.stop();
    }
}