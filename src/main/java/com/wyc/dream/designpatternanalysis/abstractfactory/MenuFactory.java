package com.wyc.dream.designpatternanalysis.abstractfactory;

/**
 * @author: wangyuancun
 * @description: 抽象工厂 【套餐工厂】;
 * @date: 2022/3/23
 */
public interface MenuFactory {
    /**
     * 搭配的主食
     * @return
     */
     IFood doFood();

    /**
     * 搭配的蔬菜
     * @return
     */
     IVegetable doVegetable();
}
