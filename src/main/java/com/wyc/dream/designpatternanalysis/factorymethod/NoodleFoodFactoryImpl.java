package com.wyc.dream.designpatternanalysis.factorymethod;

/**
 * @author: wangyuancun
 * @description: 具体的工厂实现类;
 * @date: 2022/3/22
 */
public class NoodleFoodFactoryImpl implements IFoodFactory {
    @Override
    public IFood doFood() {
        System.out.println("制作面条前置条件");
        return new NoodleFoodImpl();
    }
}
