package com.xie.shop.product.handle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Service;

/**
 * .
 *
 * @date: 2021-03-02
 * @version: 1.0
 * @author: xieenlu@beyondsoft.com
 */
@Service
public class initBean implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        String[]  names  = beanDefinitionRegistry.getBeanDefinitionNames();
        for(String name : names){
            BeanDefinition bean = beanDefinitionRegistry.getBeanDefinition(name);
            System.out.println(bean);
        }

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
}
