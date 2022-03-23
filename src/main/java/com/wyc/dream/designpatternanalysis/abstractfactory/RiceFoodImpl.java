package com.wyc.dream.designpatternanalysis.abstractfactory;

/**
 * @author: wangyuancun
 * @description: 米饭【具体产品】
 * @date: 2022/3/23
 */
public class RiceFoodImpl implements IFood {
    @Override
    public void eatFood() {
        System.out.println("美味的米饭");
    }
}
