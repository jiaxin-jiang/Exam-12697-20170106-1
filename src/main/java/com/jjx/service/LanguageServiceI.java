package com.jjx.service;

import com.jjx.bean.Language;

import java.util.List;

/**
 * Created by TandTV on 2016/12/29.
 */
public interface LanguageServiceI {
    public Language selectLanguageById(Byte languageId);
    public List<Language> showAllLanguage();
}
