package com.thoughtworks.refactoring.inlinemethod;

public class PostInlineMethod {
    private int _numberOfLateDeliveries;

    public int getRating(){
        return (_numberOfLateDeliveries > 5) ? 2 : 1;
    }

}

