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
         * 开闭原则:在面向对象编程领域中,规定软件中的对象(类，模块，函数等)应该对于扩展是开放的，但是修改是封闭的
         */
        if("noodle".equals(type)){
            return new NoodleFoodImpl();
        }else if("rice".equals(type)){
            return new RiceFoodImpl();
        }
        //这个地方返回null其实不太合理，因为后面调用需要判断是否为空，不然会有报错的情况出现;
        return null;
    }

}
