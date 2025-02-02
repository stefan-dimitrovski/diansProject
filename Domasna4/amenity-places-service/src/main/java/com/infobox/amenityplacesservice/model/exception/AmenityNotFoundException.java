package com.infobox.amenityplacesservice.model.exception;


public class AmenityNotFoundException extends RuntimeException{

    public AmenityNotFoundException(Long id) {
        super(String.format("Amenity with id %d does not exist",id));
    }
}
