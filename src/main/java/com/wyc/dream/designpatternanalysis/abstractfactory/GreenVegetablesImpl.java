package com.wyc.dream.designpatternanalysis.abstractfactory;

/**
 * @author: wangyuancun
 * @description: 青菜【具体产品】
 * @date: 2022/3/23
 */
public class GreenVegetablesImpl implements IVegetable {
    @Override
    public void eatVegetable() {
        System.out.println("美味的青菜");
    }
}
