/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter12.Exercise;

import chapter12.snippet.Song;
import chapter12.snippet.JukeboxData;

import java.util.List;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author 33980
 */

// Main class that runs the program
public class StreamPuzzle {

    // Program entry point
    public static void main(String[] args) {

        // Create a SongSearch object
        SongSearch songSearch = new SongSearch();

        // Display the top five songs
        songSearch.printTopFiveSongs();

        // Search for the first song by The Beatles
        songSearch.search("The Beatles");

        // Search for the first song by The Beach Boys
        songSearch.search("The Beach Boys");
    }
}

// Class that searches and processes songs using Java Streams
class SongSearch {

    // Load the list of songs from the JukeboxData class
    private final List<Song> songs = new JukeboxData.Songs().getSongs();

    // Displays the top five songs based on times played
    void printTopFiveSongs() {

        // Create a stream from the song list
        // Sort songs by the number of times played
        // Extract only the song titles
        // Keep the first five titles
        // Collect them into a List
        List<String> topFive = songs.stream()
                .sorted(Comparator.comparingInt(Song::getTimesPlayed))
                .map(song -> song.getTitle())
                .limit(5)
                .collect(Collectors.toList());

        // Print the list of top five song titles
        System.out.println(topFive);
    }

    // Searches for the first song by a specific artist
    void search(String artist) {

        // Create a stream of songs
        // Keep only songs by the specified artist
        // Return the first matching song (if one exists)
        Optional<Song> result = songs.stream()
                .filter(song -> song.getArtist().equals(artist))
                .findFirst();

        // Check whether a matching song was found
        if (result.isPresent()) {

            // Print the title of the matching song
            System.out.println(result.get().getTitle());

        } else {

            // Display a message if no songs were found
            System.out.println("No songs found by: " + artist);
        }
    }
}