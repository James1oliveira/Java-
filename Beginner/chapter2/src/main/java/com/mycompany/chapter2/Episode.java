/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter2;

/**
 *
 * 
 */
public class Episode {

    // Stores the series (season) number of the episode
    int seriesNumber;

    // Stores the episode number within the series
    int episodeNumber;

    // Method to simulate playing the episode
    void play() {

        // Display a message showing which episode is being played
        System.out.println("Playing episode " + episodeNumber);
    }

    // Method to simulate skipping the introduction
    void skipIntro() {

        // Display a message indicating the intro has been skipped
        System.out.println("Skipping intro...");
    }

    // Method to simulate moving to the next episode
    void skipToNext() {

        // Display a message indicating the next episode is loading
        System.out.println("Loading next episode...");
    }
}