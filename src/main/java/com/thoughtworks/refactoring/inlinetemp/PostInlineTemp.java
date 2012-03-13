package com.thoughtworks.refactoring.inlinetemp;

public class PostInlineTemp {

    private Order anOrder;

    public boolean foo(){
        return (anOrder.basePrice() > 1000);
    }

    private class Order {
        public double basePrice() {
            return 0;
        }
    }
}
