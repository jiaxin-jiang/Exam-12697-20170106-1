package com.jjx.mapper;

import com.jjx.bean.Film;
import com.jjx.bean.Page;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * FilmMapper类
 */
public interface FilmMapper {

    int insertFilm(Film film);

    int updateByFilmId(Film film);

    Film selectByFilmId(Short filmId);

    List<Film> showAllFilm(Page page);

    int selectCount(Page page);

    int delFilm(Short filmId);
}