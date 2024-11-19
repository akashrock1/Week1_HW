package com.akash.week1.HW;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
    @Autowired
    Frosting obj1;
    @Autowired
    Syrup obj2;


    public String BakeCake(){


        return "Cake is Ready Using "+obj1.getFrostingType()+", "+obj2.getSyrupType();
    }



}
