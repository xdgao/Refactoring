package com.thoughtworks.refactoring.extractmethod;

import java.util.Enumeration;
import java.util.Vector;

public class PostExtractMethod {
    private String _name;

    class Order{

        private double amount;

        public double getAmount() {
            return amount;
        }
    }
    private Vector _orders;

    void printOwing() {

        Enumeration e = _orders.elements();
        double outstanding = 0.0;

        // print banner
        System.out.println ("**************************");
        System.out.println ("***** Customer Owes ******");
        System.out.println ("**************************");

        // calculate outstanding
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            outstanding += each.getAmount();
        }

        //print details
        System.out.println ("name:" + _name);
        System.out.println ("amount" + outstanding);
    }
}
