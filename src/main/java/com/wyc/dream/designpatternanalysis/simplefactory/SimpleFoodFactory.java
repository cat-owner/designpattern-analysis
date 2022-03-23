package com.wyc.dream.designpatternanalysis.simplefactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author: wangyuancun
 * @description: 基于FoodFactory简单工厂进行改造类
 * @date: 2022/2/24
 */
public class SimpleFoodFactory {
    IFood doFood(Class<? extends IFood> foodClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if(foodClass!=null){
            //这种方法在java1.9中已经被设置为过期了，原因是说这个方法会绕过编译时的异常
           // return foodClass.newInstance();
            return foodClass.getDeclaredConstructor().newInstance();
        }
        return null;

    }
}
