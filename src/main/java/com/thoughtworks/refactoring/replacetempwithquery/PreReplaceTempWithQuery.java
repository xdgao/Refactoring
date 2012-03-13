package com.thoughtworks.refactoring.replacetempwithquery;

public class PreReplaceTempWithQuery {

    private double _quantity;
    private double _itemPrice;

    public PreReplaceTempWithQuery(double quantity, double itemPrice) {
        _quantity = quantity;
        _itemPrice = itemPrice;
    }


    public double foo(){
        /** Situation 1: 临时变量影响了其他的重构手法
         *  临时变量只被赋值过一次
         *  将临时变量的赋值表达式作为方法提取
         */
        double basePrice = _quantity * _itemPrice;
        if (basePrice > 1000)
            return basePrice * 0.95;
        else
            return basePrice * 0.98;
    }
}
