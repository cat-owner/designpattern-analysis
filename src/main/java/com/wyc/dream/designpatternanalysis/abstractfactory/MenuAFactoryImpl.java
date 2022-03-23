package com.wyc.dream.designpatternanalysis.abstractfactory;

/**
 * @author: wangyuancun
 * @description: 套餐A的工厂
 * @date: 2022/3/23
 */
public class MenuAFactoryImpl implements MenuFactory{
    @Override
    public IFood doFood() {
        RiceFoodImpl riceFood = new RiceFoodImpl();
        System.out.println("-------套餐A的主食-------");
        return riceFood;
    }

    @Override
    public IVegetable doVegetable() {
        GreenVegetablesImpl greenVegetables = new GreenVegetablesImpl();
        System.out.println("-------套餐A的菜-------");
        return greenVegetables;
    }
}
