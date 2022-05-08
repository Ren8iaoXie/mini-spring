package com.xrb.service;

import com.xrb.spring.BeanPostProcessor;
import com.xrb.spring.annotation.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * bean后置处理器
 *
 * @author xieren8iao
 * @date 2022/5/8 1:36 下午
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(String beanName, Object bean) {
        if (beanName.equals("userService")) {
            System.out.println(beanName + " postProcessBeforeInitialization...");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(String beanName, Object bean) {
        if (beanName.equals("userService")) {
            Object proxyInstance = Proxy.newProxyInstance(MyBeanPostProcessor.class.getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("切面逻辑...");
                    return method.invoke(bean, args);
                }
            });
            System.out.println(beanName + " postProcessAfterInitialization...");
            return proxyInstance;
        }
        return bean;
    }
}