package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * bean 工厂
 *
 * @author Elsen 2023/12/4
 */
public class BeanFactory {
    private Map<String, Object> beanMap = new HashMap<>();

    public void registerBean(String name, Object bean){
        beanMap.put(name, bean);
    }

    public Object getBean(String name) {
        return beanMap.get(name);
    }
}
