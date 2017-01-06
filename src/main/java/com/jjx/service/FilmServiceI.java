package com.jjx.service;

import com.jjx.bean.Film;
import com.jjx.bean.Page;

import java.util.List;

/**
 * Created by TandTV on 2016/12/29.
 */
public interface FilmServiceI {
    public Film selectFilmById(Short filmId);

    public int insertFilm(Film film);

    public List<Film> showAllFilm(Page page);

    public int selectCount(Page page);

    public boolean updateByFilmId(Film film);

    public boolean delFilm(Short filmId);
}
