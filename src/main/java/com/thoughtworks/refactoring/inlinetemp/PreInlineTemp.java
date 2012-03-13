package com.thoughtworks.refactoring.inlinetemp;

public class PreInlineTemp {

    private Order anOrder;

    public boolean foo(){
        /** situation 1: 临时变量妨碍了其他的重构手法
         *  确保临时变量只被赋值了一次
         *  将临时变量替换为表达式自身
         */
        double basePrice = anOrder.basePrice();
        return (basePrice > 1000);
    }

    private class Order {
        public double basePrice() {
            return 0;
        }
    }
}
