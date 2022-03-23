package com.wyc.dream.designpatternanalysis.abstractfactory;

/**
 * @author: wangyuancun
 * @description: 抽象工厂测试类
 * @date: 2022/3/23
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
      MenuFactory menuAFactory= new MenuAFactoryImpl();
      menuAFactory.doFood().eatFood();
      menuAFactory.doVegetable().eatVegetable();
      MenuFactory menuBFactory=new MenuBFactoryImpl();
      menuBFactory.doFood().eatFood();
      menuBFactory.doVegetable().eatVegetable();
    }
}
