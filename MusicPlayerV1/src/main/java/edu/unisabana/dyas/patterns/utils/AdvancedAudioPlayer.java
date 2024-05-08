package edu.unisabana.dyas.patterns.utils;

// Clase que implementa una interfaz diferente
public class AdvancedAudioPlayer {
    public void playMp4(String fileName) {
        System.out.println("Reproduciendo archivo MP4: " + fileName);
    }

    public void playVlc(String fileName) {
        System.out.println("Reproduciendo archivo VLC: " + fileName);
    }

    public void stop() {
        System.out.println("Deteniendo reproducción");
    }
}