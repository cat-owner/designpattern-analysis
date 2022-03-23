package com.wyc.dream.designpatternanalysis.simplefactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2022/2/24
 */
public class SimpleCustomerTest {
    public static void main(String[] args) {
        try {
            //面条
            new SimpleFoodFactory().doFood(NoodleFoodImpl.class).eatFood();
            new SimpleFoodFactory().doFood(RiceFoodImpl.class).eatFood();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
