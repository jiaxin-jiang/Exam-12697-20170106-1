package com.jjx.bean;

import java.util.List;

/**
 * Created by TandTV on 2017/1/6.
 */
public class ResponseFilm {

    private Film film;

    private List<Language> languages;

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }
}
