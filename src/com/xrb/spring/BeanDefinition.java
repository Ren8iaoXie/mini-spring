package com.xrb.spring;

/**
 * @author xieren8iao
 * @date 2022/5/8 10:49 上午
 */

public class BeanDefinition {
    private Class type;

    private String scope;

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}