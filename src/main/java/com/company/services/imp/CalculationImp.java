package com.company.services.imp;


import com.company.exeptions.DivisionByZeroException;
import com.company.services.Calculation;

public class CalculationImp implements Calculation {

    @Override
    public double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new DivisionByZeroException("Math error.Division by zero");
        } else {
            return dividend / divisor;
        }
    }
}
