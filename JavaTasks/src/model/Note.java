package model;

import java.time.LocalDate; // import the LocalDate class

public class Note {

    String    text;

    LocalDate creationDate;

    public Note ( final String text ) {
        this.text = text;
        this.creationDate = LocalDate.now();
    }

    public String getText () {
        return text;
    }

    public void setText ( final String text ) {
        this.text = text;
    }

    public LocalDate getCreationDate () {
        return creationDate;
    }

    public void setCreationDate ( final LocalDate creationDate ) {
        this.creationDate = creationDate;
    }

}
