package com.jjx.mapper;

import com.jjx.bean.Language;

import java.util.List;

public interface LanguageMapper {

    Language selectLanguageByLanguageId(Byte languageId);

    List<Language> showAllLanguage();
}