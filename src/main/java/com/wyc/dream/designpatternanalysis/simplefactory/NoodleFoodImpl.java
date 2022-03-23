package com.wyc.dream.designpatternanalysis.simplefactory;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2022/2/21
 */
public class NoodleFoodImpl implements IFood{
    @Override
    public void eatFood() {
        System.out.println("美味的面条");
    }
}
