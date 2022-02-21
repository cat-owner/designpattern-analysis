package com.wyc.dream.designpatternanalysis.factory;

/**
 * @author: wangyuancun
 * @description: 食物简单工厂类
 * @date: 2022/2/21
 */
public class FoodFactory {
    IFood doFood(String type){
        String noodleFoodType = "noodle";
        String riceFoodType = "rice";
        if(noodleFoodType.equals(type)){
            return new NoodleFoodImpl();
        }else if(riceFoodType.equals(type)){
            return new RiceFoodImpl();
        }
        return null;
    }

}
