package com.wyc.dream.designpatternanalysis.abstractfactory;

/**
 * @author: wangyuancun
 * @description: 套餐B
 * @date: 2022/3/23
 */
public class MenuBFactoryImpl implements MenuFactory{
    @Override
    public IFood doFood() {
        NoodleFoodImpl noodleFood = new NoodleFoodImpl();
        System.out.println("-------套餐B的主食-------");
        return noodleFood;
    }

    @Override
    public IVegetable doVegetable() {
        ChineseCabbageImpl chineseCabbage = new ChineseCabbageImpl();
        System.out.println("-------套餐B的菜-------");
        return chineseCabbage;
    }
}
