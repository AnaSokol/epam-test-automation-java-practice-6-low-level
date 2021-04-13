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
	    	BigDecimal bd500 = new BigDecimal("500");
	    	BigDecimal bd1000 = new BigDecimal("1000");   	
	
	    	if (quantity>100) {
	    		BigDecimal bonusOver100 = bd500.add(bonus);
	    		super.setBonus(bonusOver100);
	    	}
	    	else if (quantity>150) {
	    		BigDecimal bonusOver150 = bd1000.add(bonus);
	    		super.setBonus(bonusOver150);
	    	}
	    	else 
	    		super.setBonus (bonus);
	    }

}
