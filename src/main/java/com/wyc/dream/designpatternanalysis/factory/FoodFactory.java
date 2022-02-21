package com.wyc.dream.designpatternanalysis.factory;

/**
 * @author: wangyuancun
 * @description: 食物简单工厂类
 * @date: 2022/2/21
 */
public class FoodFactory {
    IFood doFood(String type){
        /**
         * 这个地方如果业务需要新增新的食物产品，则需要改这个代码，不太符合开闭原则
         */
        if("noodle".equals(type)){
            return new NoodleFoodImpl();
        }else if("rice".equals(type)){
            return new RiceFoodImpl();
        }
        return null;
    }

}
