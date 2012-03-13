package com.thoughtworks.refactoring.inlinemethod;

public class PreInlineMethod {

    private int _numberOfLateDeliveries;

    public int getRating(){
        return (moreThanFiveLateDeliveries()) ? 2 : 1;
    }

    /** situation 1: 函数的内部代码与函数名称同样清晰易懂
     *  检查函数不具备多态性
     *  将函数体直接替换函数调用点
     * @return
     */
    private boolean moreThanFiveLateDeliveries() {
        return _numberOfLateDeliveries > 5;
    }
}
