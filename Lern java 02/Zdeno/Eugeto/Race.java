package Eugeto;

import java.time.LocalDate;

public class Race {
    int year;
    String title;
    LocalDate date;
    Racer winer;

    public void setTitle(String title) {
        this.title = title;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setWiner(Racer winer) {
        this.winer = winer;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public Racer getWiner() {
        return winer;
    }
    public LocalDate getDate() {
        return date;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
}
