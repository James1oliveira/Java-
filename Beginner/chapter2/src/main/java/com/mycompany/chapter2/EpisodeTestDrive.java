/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter2;

/**
 *
 * 
 */
public class EpisodeTestDrive {

    public static void main(String[] args) {

        // Create a new Episode object
        Episode episode = new Episode();

        // Set the series number for this episode
        episode.seriesNumber = 4;

        // Attempt to play the episode
        // BUG: This will cause a compilation error because
        // the Episode class does not contain a play() method.
        episode.play();

        // Call the skipIntro() method to skip the introduction
        episode.skipIntro();
    }
}
