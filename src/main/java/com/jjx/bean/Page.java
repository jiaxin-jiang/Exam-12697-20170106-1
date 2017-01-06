package com.jjx.bean;

import java.util.List;

/**
 * Created by TandTV on 2017/1/4.
 */
public class Page {

    private int pageNow; // 当前页数

    private int pageSize; // 每页显示记录的条数

    private int totalCount; // 总的记录条数

    private int totalPageCount; // 总的页数

    private int startPos; // 开始位置，从0开始

    private Film film;

    private List<Film> films;

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public int getTotalPageCount() {
        totalPageCount = getTotalCount() / getPageSize();
        return (totalCount % pageSize == 0) ? totalPageCount
                : totalPageCount + 1;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getStartPos() {
        return (pageNow - 1) * pageSize;
    }

    public void setStartPos(int startPos) {
        this.startPos = startPos;
    }


}
