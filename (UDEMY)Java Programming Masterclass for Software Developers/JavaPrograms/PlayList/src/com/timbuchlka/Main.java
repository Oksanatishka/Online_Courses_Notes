package com.timbuchlka;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
	// write your code here
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Stormbringer1", 4.7);
        album.addSong("Stormbringer2", 4.8);
        album.addSong("Stormbringer3", 4.9);
        albums.add(album);

        album = new Album("For those about to rock", "Ac/DC");
        album.addSong("Song1", 4.9);
        album.addSong("Song2", 4.9);
        album.addSong("Song3", 4.9);
        album.addSong("Song4", 4.9);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Stormbringer1", playlist);
        albums.get(0).addToPlaylist("Stormbringer2", playlist);
        albums.get(0).addToPlaylist("dgs", playlist);   // doesn't exist
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(33, playlist); //no track

        play(playlist);

//        int choice = 0;
//        boolean quit = false;
//        printMenu();
//
//        while (!quit){
//            Scanner scanner = new Scanner(System.in);
//            choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice){
//                case 0:
//                    quit = true;
//                    break;
//                case 1:
//                    skipForward();
//                    break;
//                case 2:
//                    skipBackward();
//                    break;
//                case 3:
//                    printMenu();
//                    break;
//            }
//        }
    }

    private static void play(LinkedList<Song> playlist){
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("No songs in playlist");
            return;
        }
        else {
            System.out.println("Now playing " + listIterator.next().toString());
        }
    }
//    public static void printMenu(){
//        System.out.println("Press: ");
//        System.out.println(" 0 - to quit");
//        System.out.println(" 1 - to skip forward");
//        System.out.println(" 2 - to skip backward");
//        System.out.println(" 3 - to show menu options");
//    }
}
