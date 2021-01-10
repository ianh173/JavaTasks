package model;

import java.time.LocalDate; // import the LocalDate class
import java.util.ArrayList;

public class Task {

    ArrayList<Note> notes;
    LocalDate       startDate;
    LocalDate       endDate;
    String          name;
    Integer         priority;

    public Task ( final String name, final Integer priority ) {
        this.notes = new ArrayList<Note>();
        this.name = name;
        this.startDate = LocalDate.now();
        this.priority = priority;
    }

    public ArrayList<Note> getNotes () {
        return notes;
    }

    public void setNotes ( final ArrayList<Note> notes ) {
        this.notes = notes;
    }

    public LocalDate getStartDate () {
        return startDate;
    }

    public void setStartDate ( final LocalDate startDate ) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate () {
        return endDate;
    }

    public void setEndDate ( final LocalDate endDate ) {
        this.endDate = endDate;
    }

    public String getName () {
        return name;
    }

    public void setName ( final String name ) {
        this.name = name;
    }

    public Integer getPriority () {
        return priority;
    }

    public void setPriority ( final Integer priority ) {
        this.priority = priority;
    }

}
