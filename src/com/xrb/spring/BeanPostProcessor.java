package com.xrb.spring;

/** bean对象后置处理器
 * @author xieren8iao
 * @date 2022/5/8 1:34 下午
 */
public interface BeanPostProcessor {
    public Object postProcessBeforeInitialization(String beanName, Object bean);
    public Object postProcessAfterInitialization(String beanName, Object bean);
}