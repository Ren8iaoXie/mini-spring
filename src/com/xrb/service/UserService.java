package com.xrb.service;

import com.xrb.spring.BeanNameAware;
import com.xrb.spring.InitialingBean;
import com.xrb.spring.annotation.Autowired;
import com.xrb.spring.annotation.Component;
import com.xrb.spring.annotation.Scope;

/**
 * @author xieren8iao
 * @date 2022/5/8 9:18 上午
 */
@Component("userService")
@Scope("prototype")
public class UserService implements BeanNameAware, InitialingBean,UserInterface {
    @Autowired
    private OrderService orderService;

    String beanName;
    public void test() {
        System.out.println(orderService);
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName=beanName;
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("afterProperties...");
    }
}