package com.thoughtworks.refactoring.replacetempwithquery;

public class PostReplaceTempWithQuery {

    private double _quantity;
    private double _itemPrice;

    public PostReplaceTempWithQuery(double quantity, double itemPrice) {
        _quantity = quantity;
        _itemPrice = itemPrice;
    }

    public double foo(){
        if (basePrice() > 1000)
            return basePrice() * 0.95;
        else
            return basePrice() * 0.98;
    }

    private double basePrice() {return _quantity * _itemPrice;}
}
