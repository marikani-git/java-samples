package org.marikani.oops;

public enum Gender {
    MALE("Male"),
    FEMALE("Female");

    private final String genderName;

    Gender(String genderName) {
        this.genderName = genderName;
    }
}
