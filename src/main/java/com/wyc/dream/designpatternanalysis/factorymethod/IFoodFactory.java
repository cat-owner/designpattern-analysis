package com.wyc.dream.designpatternanalysis.factorymethod;

/**
 * @author: wangyuancun
 * @description: 抽象工厂;
 * @date: 2022/3/22
 */
public interface IFoodFactory {
    /**
     * 食物烹饪方法;
     * @return
     */
     IFood doFood();
}
