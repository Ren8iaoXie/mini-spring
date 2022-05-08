package com.xrb.service;

import com.xrb.spring.SpringApplicationContext;


/**
 * @author xieren8iao
 * @date 2022/5/8 10:27 上午
 */
public class TestMain {
    public static void main(String[] args) {
        SpringApplicationContext springApplicationContext=new SpringApplicationContext(AppConfig.class);
        UserInterface userService = (UserInterface) springApplicationContext.getBean("userService");
        userService.test();
    }
}