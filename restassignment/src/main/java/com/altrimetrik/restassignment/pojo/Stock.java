package com.altrimetrik.restassignment.pojo;

import java.util.Date;

public class Stock {

	public Stock(String stockQuote, String stockName, Date date, Double price, String currency) {
		super();
		this.stockQuote = stockQuote;
		this.stockName = stockName;
		this.date = date;
		this.price = price;
		this.currency = currency;
	}

	public String stockQuote;
	public String stockName;
	public Date date;
	public Double price;
	public String currency;

	public String getStockQuote() {
		return stockQuote;
	}

	public void setStockQuote(String stockQuote) {
		this.stockQuote = stockQuote;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
