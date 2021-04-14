package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class SalesPerson extends Employee {
	
    private int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super (name, salary);
        this.percent = percent;
    }


    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus.compareTo(BigDecimal.ZERO) < 0 || bonus.equals(null))
	    		throw new IllegalArgumentException();
    	BigDecimal bd2 = new BigDecimal("2");
    	BigDecimal bd3 = new BigDecimal("3");
    	if (percent>100 && percent<=200) {
    		super.setBonus(bd2.multiply(bonus));
    	}
    	else if (percent>200) {
    		super.setBonus(bd3.multiply(bonus));
    	}
    	else 
    		super.setBonus(bonus);
    }
   
}