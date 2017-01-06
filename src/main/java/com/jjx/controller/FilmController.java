package com.jjx.controller;

import com.jjx.bean.Film;
import com.jjx.bean.Language;
import com.jjx.bean.Page;
import com.jjx.bean.ResponseFilm;
import com.jjx.service.FilmServiceI;
import com.jjx.service.LanguageServiceI;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by TandTV on 2017/1/4.
 */
@Controller
public class FilmController {

    @Autowired
    private FilmServiceI filmService;
    @Autowired
    private LanguageServiceI languageService;

    @RequestMapping(path = "/showAll", method = RequestMethod.GET)
    @ResponseBody
    public Page showAll(
            @RequestParam(name = "filmId", required = false) String filmId,
            @RequestParam(name = "title", required = false) String title,
            @RequestParam(name = "pageNow", required = false, defaultValue = "1") int pageNow,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        //page:pageSize、pageNow、totalPageCount
        //p:pageNow、film
        Page page = new Page();
        page.setPageSize(pageSize);
        page.setPageNow(pageNow);
        Film film = new Film();
        if (filmId != null || !"".equals(filmId)) {
            try {
                film.setFilmId(Short.parseShort(filmId));
            } catch (Exception e) {
                //System.out.println("转型出错");
            }
        }
        if (title != null || !"".equals(title)) {
            try {
                film.setTitle(title);
            } catch (Exception e) {
                System.out.println("封装title");
            }
        }
        page.setFilm(film);
        List<Film> films = filmService.showAllFilm(page);
        page.setFilms(films);
        page.setTotalCount(filmService.selectCount(page));
        return page;
    }

    @RequestMapping(path = "/updateFilm", method = RequestMethod.GET)
    @ResponseBody
    public ResponseFilm updateFilm(@RequestParam(name = "filmId") Short filmId) {
        ResponseFilm responseFilm = new ResponseFilm();
        responseFilm.setFilm(filmService.selectFilmById(filmId));
        responseFilm.setLanguages(languageService.showAllLanguage());
        return responseFilm;
    }

    @RequestMapping(path = "/update", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView update(
            @RequestParam(name = "filmId") Short filmId,
            @RequestParam(name = "title") String title,
            @RequestParam(name = "description") String description,
            @RequestParam(name = "languageId") Byte languageId
    ) {
        ModelAndView mv = new ModelAndView();
        Film film = new Film();
        film.setFilmId(filmId);
        film.setTitle(title);
        film.setDescription(description);
        film.setLanguageId(languageId);

        if (filmService.updateByFilmId(film)) {
            mv.setViewName("/pages/filmList.html");
            return mv;
        } else {
            mv.setViewName("/pages/loginErr.html");
            return mv;
        }
    }

    @RequestMapping(path = "/insertFilm",method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView insertFilm(
                           @RequestParam(name = "title") String title,
                           @RequestParam(name = "description") String description,
                           @RequestParam(name = "languageId") Byte languageId) {
        Film film = new Film();
        film.setTitle(title);
        film.setDescription(description);
        film.setLanguageId(languageId);
        ModelAndView mv = new ModelAndView();
        if(filmService.insertFilm(film)>0){
            mv.setViewName("/pages/filmList.html");
            return mv;
        }else {
            mv.setViewName("/pages/loginErr.html");
            return mv;
        }
    }
    @RequestMapping(path ="/delFilm" , method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> delFilm(@RequestParam(name = "filmId") Short filmId){
        boolean bool=filmService.delFilm(filmId);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("bool",bool);
        return map;
    }
}
