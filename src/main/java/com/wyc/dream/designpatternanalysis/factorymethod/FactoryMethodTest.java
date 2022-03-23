package com.wyc.dream.designpatternanalysis.factorymethod;

/**
 * @author: wangyuancun
 * @description: 工厂模式方法测试类
 * @date: 2022/3/22
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        IFoodFactory noodleFactory=new NoodleFoodFactoryImpl();
        IFood noodleFood = noodleFactory.doFood();
        noodleFood.eatFood();
        IFoodFactory riceFoodFactory = new RiceFoodFactoryImpl();
        IFood riceFood = riceFoodFactory.doFood();
        riceFood.eatFood();

    }


}
