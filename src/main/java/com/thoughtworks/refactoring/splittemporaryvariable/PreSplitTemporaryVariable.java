package com.thoughtworks.refactoring.splittemporaryvariable;

public class PreSplitTemporaryVariable {

    private double _primaryForce = 0;
    private double _secondaryForce = 0;
    private double _mass = 0 ;
    private int _delay = 0;

    double getDistanceTravelled (int time) {
        double result;
        /** Situation 1: 一个临时变量被多次赋值,说明临时变量承担太多责任
         *  在每次赋值处将临时变量重命名为新的变量
         */
        double acc = _primaryForce / _mass;
        int primaryTime = Math.min(time, _delay);
        result = 0.5 * acc * primaryTime * primaryTime;
        int secondaryTime = time - _delay;
        if (secondaryTime > 0) {
            double primaryVel = acc * _delay;
            acc = (_primaryForce + _secondaryForce) / _mass;
            result +=  primaryVel * secondaryTime + 0.5 * acc *
                    secondaryTime * secondaryTime;
        }
        return result;
    }
}
