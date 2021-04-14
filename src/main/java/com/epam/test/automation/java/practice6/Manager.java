package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class Manager extends Employee {
	   
	    private int quantity;

	    public Manager (String name, BigDecimal salary, int clientAmount) {
	        super (name, salary);
	        this.quantity = clientAmount;
	    }

	    @Override
	    public void setBonus(BigDecimal bonus) {
	        if (bonus.compareTo(BigDecimal.ZERO) < 0 || bonus.equals(null))
    		    throw new IllegalArgumentException();

	    	BigDecimal bd500 = new BigDecimal("500");
	    	BigDecimal bd1500 = new BigDecimal("1500");   	
	
	    	if (quantity>100) {	 	
	    		BigDecimal bonusOver100 = bonus.add(bd500);
	    		super.setBonus(bonusOver100);
	    	}
	    	else if (quantity>150) {
	    		BigDecimal bonusOver150 = bonus.add(bd1500);
	    		super.setBonus(bonusOver150);
	    	}
	    	else 
	    		super.setBonus (bonus);
	    }

}
