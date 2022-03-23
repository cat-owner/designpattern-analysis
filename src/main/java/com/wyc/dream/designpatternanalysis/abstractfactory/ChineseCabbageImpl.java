package com.wyc.dream.designpatternanalysis.abstractfactory;

/**
 * @author: wangyuancun
 * @description: 白菜【具体产品】
 * @date: 2022/3/23
 */
public class ChineseCabbageImpl implements IVegetable {
    @Override
    public void eatVegetable() {
        System.out.println("美味的大白菜");
    }
}
