package br.ufal.main.model;

import java.util.Date;

public class Sale {
	private Date date;
	private int idEmployee, paymentMethod;
	private double saleValue;
	
	public void setDate(Date date) {
		this.date = date;
	}
	public int getId() {
		return idEmployee;
	}
	public void setId(int id) {
		this.idEmployee = id;
	}
	public double getSaleValue() {
		return saleValue;
	}
	public void setSaleValue(double saleValue) {
		this.saleValue = saleValue;
	}	
	public void setPaymentMethod(int paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	@Override
	public String toString() {
		return "Date: " + date + "\nID: " + idEmployee + "\nSale value: " + saleValue;
	}

}
