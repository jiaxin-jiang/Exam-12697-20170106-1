package com.jjx.controller;

import com.jjx.bean.Language;
import com.jjx.service.LanguageServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by TandTV on 2017/1/6.
 */
@Controller()
public class LanguageController {

    @Autowired
    private LanguageServiceI languageServiceI;

    @RequestMapping(path = "/languages" ,method = RequestMethod.GET)
    @ResponseBody
    public List<Language> showAllLanguage(){
        return languageServiceI.showAllLanguage();
    }
}
