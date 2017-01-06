package com.jjx.service.impl;

import com.jjx.bean.Film;
import com.jjx.bean.Page;
import com.jjx.mapper.FilmMapper;
import com.jjx.service.FilmServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TandTV on 2016/12/29.
 */
@Service
public class FilmServiceImpl implements FilmServiceI {

    @Autowired
    private FilmMapper filmMapper;

    @Override
    public Film selectFilmById(Short filmId) {
        return filmMapper.selectByFilmId(filmId);
    }

    @Override
    public int insertFilm(Film film) {
        return filmMapper.insertFilm(film);
    }

    @Override
    public List<Film> showAllFilm(Page page) {
        return filmMapper.showAllFilm(page);
    }

    @Override
    public int selectCount(Page page){
        return filmMapper.selectCount(page);
    }

    @Override
    public boolean updateByFilmId(Film film) {
        if(filmMapper.updateByFilmId(film)>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delFilm(Short filmId) {
        try {
            filmMapper.delFilm(filmId);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
