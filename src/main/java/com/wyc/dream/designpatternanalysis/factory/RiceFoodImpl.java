package com.wyc.dream.designpatternanalysis.factory;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2022/2/21
 */
public class RiceFoodImpl implements IFood {
    @Override
    public void doFood() {
        System.out.println("松软的米饭");
    }
}
