package com.jjx.controller;

import com.jjx.service.CustomerServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by TandTV on 2017/1/6.
 */
@Controller
public class CustomerController {

    @Autowired
    private CustomerServiceI customerServiceI;

    @RequestMapping(path = "/volByFirstName" ,method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> volByFirstName(@RequestParam(name = "firstName") String firstname){
        boolean bool=customerServiceI.selectByFirstName(firstname);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("bool",bool);
        return map;
    }
}
