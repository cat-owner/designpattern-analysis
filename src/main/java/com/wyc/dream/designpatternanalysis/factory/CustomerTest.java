package com.wyc.dream.designpatternanalysis.factory;

/**
 * @author: wangyuancun
 * @description: 简单工厂模式测试类;
 * @date: 2022/2/21
 */
public class CustomerTest {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        IFood noodle = foodFactory.doFood("noodle");
        noodle.doFood();
        IFood rice = foodFactory.doFood("rice");
        rice.doFood();

    }

}
