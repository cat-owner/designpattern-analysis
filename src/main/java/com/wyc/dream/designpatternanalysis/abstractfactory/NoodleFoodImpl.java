package com.wyc.dream.designpatternanalysis.abstractfactory;

/**
 * @author: wangyuancun
 * @description: 面条 【具体产品】
 * @date: 2022/3/22
 */
public class NoodleFoodImpl implements IFood {
    @Override
    public void eatFood() {
        System.out.println("美味的面条");
    }
}
