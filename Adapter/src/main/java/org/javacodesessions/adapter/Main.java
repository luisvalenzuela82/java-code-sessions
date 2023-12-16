/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.adapter;

import org.javacodesessions.adapter.modelo.AdvancedPlayer;
import org.javacodesessions.adapter.modelo.AudioPlayer;

/**
 *
 * @author Luis Valenzuela
 */
public class Main {

    public static void main(String[] args) {
//        AdvancedPlayer advancedMPlayer = new AdvancedPlayer();
//        advancedMPlayer.playMp4("Corazón espinado.mp4");
//        advancedMPlayer.playVlc("Canciones Favoritas.vlc");
        
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Viva La Vida.mp3");
        audioPlayer.play("mp4", "Corazón espinado.mp4");
        audioPlayer.play("vlc", "Canciones Favoritas.vlc");
    }
}
