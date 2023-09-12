package com.sozcos.spring.frame.explore;

import java.util.HashMap;
import java.util.Map;

/**
 * bean工厂
 *
 * @author Elsen 2023/9/12
 */
public class BeanFactory {

    private Map<String, Object> beanMap = new HashMap<String, Object>();

    public void registerBean(String name, Object bean) {
        beanMap.put(name, bean);
    }

    public Object getBean(String name){
        return beanMap.get(name);
    }
}
