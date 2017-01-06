package com.jjx.service.impl;

import com.jjx.bean.Customer;
import com.jjx.mapper.CustomerMapper;
import com.jjx.service.CustomerServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by TandTV on 2017/1/6.
 */
@Service
public class CustomerServiceImpl implements CustomerServiceI {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public boolean selectByFirstName(String firstName) {
        if (customerMapper.selectByFirstName(firstName)!=0){
            return true;
        }
        return false;
    }
}
