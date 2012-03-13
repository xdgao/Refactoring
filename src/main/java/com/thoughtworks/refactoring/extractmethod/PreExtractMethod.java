package com.thoughtworks.refactoring.extractmethod;

import java.util.Enumeration;
import java.util.Vector;

public class PreExtractMethod {

    private String _name;

    private Vector _orders;

    public PreExtractMethod(Vector orders, String name) {
        this._orders = orders;
        this._name = name;
    }

    class Order{

        private double amount;

        Order(double amount) {this.amount = amount;}

        public double getAmount() {
            return amount;
        }
    }

    void printOwing() {

        printBanner();

        // calculate outstanding
        double outstanding = getOutstanding();

        //print details
        printDetails(outstanding);
    }

    /** situation 1: 目标函数不包含源函数的任何局部变量和参数
     *  直接提取方法
     */
    private void printBanner() {
        System.out.println ("**************************");
        System.out.println ("***** Customer Owes ******");
        System.out.println ("**************************");
    }

    /** situation 2: 目标函数包含源函数的局部变量，但只读取变量
     *  提取方法时，将局部变量以参数传入
     * @param outstanding
     */
    private void printDetails(double outstanding) {
        System.out.println ("name:" + _name);
        System.out.println ("amount" + outstanding);
    }

    /** situation 3: 目标函数会修改源函数的一个局部变量
     *  提取方法时，将局部变量修改后的结果作为返回值
     * @return
     */
    private double getOutstanding() {
        double result = 0;
        Enumeration e = _orders.elements();
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            result += each.getAmount();
        }
        return result;
    }
}
