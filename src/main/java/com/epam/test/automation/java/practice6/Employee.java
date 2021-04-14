package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public abstract class Employee {
    private String name;
    private BigDecimal salary;
    protected BigDecimal bonus;
    
    public String getName() {
        return name;
    }
    
    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
    	if (salary.compareTo(BigDecimal.ZERO)<0 || salary == null)
    		throw new IllegalArgumentException("Salary cannot be a negative number");
        this.salary = salary;
    }

    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.setSalary(salary);
    }
	
	public BigDecimal getBonus() {
        return bonus;
    }
    
    public abstract void setBonus(BigDecimal bonus);
    
     public BigDecimal toPay () {
    	if (bonus == null || bonus.compareTo(BigDecimal.ZERO) < 0)
    		throw new IllegalArgumentException("Bonus is not set or <0");
    	return this.salary.add(this.bonus);	
    }
}
