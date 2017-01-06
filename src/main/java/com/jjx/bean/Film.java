package com.jjx.bean;

public class Film {

    private Short filmId;

    private String title;

    private Byte languageId;

    private String description;

    private Language language;

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Short getFilmId() {
        return filmId;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Byte getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Byte languageId) {
        this.languageId = languageId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}