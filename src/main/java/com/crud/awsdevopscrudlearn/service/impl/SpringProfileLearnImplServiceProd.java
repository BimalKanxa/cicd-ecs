package com.crud.awsdevopscrudlearn.service.impl;

import com.crud.awsdevopscrudlearn.service.SpringProfileLearn;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class SpringProfileLearnImplServiceProd implements SpringProfileLearn {
    @Override
    public String getData(){
        return "SpringProfileLearnImplServiceProd";
    }
}
