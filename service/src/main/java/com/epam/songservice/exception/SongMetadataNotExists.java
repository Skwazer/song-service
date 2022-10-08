package com.epam.songservice.exception;


public class SongMetadataNotExists extends RuntimeException{
    public SongMetadataNotExists(String message) {
        super(message);
    }
}
