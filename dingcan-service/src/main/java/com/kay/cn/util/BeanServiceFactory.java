package com.kay.cn.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.stereotype.Component;

@Component
public class BeanServiceFactory implements BeanFactoryAware {

    private static BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        BeanServiceFactory.beanFactory = beanFactory;
    }

    /**
     * 返回spring配置的bean
     */
    public static Object getBean(String var1){
        if (beanFactory == null) {
            throw new BeanInitializationException("BeanServiceUtil init error, beanFactory is null");
        }
        return beanFactory.getBean(var1);
    }

    /**
     * 返回spring配置的bean
     */
    public static <T> T getBean(Class<T> requiredType){
        if (beanFactory == null) {
            throw new BeanInitializationException("BeanServiceUtil init error, beanFactory is null");
        }
        return beanFactory.getBean(requiredType);
    }
}
