package com.altrimetrik.restassignment.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.altrimetrik.restassignment.pojo.Stock;

@Service
public class StockService {
	
	public List<Stock> getStocks(){
		List<Stock> stocks = new ArrayList<Stock>();
		stocks.add(new Stock("HCLTECH", "Hcl Technologies Ltd",new Date(), 824.20, "INR"));
		stocks.add(new Stock("TCS", "Tata Consultancy Ltd",new Date(), 2500.00, "INR"));
		stocks.add(new Stock("RELIANCE", "Itc Ltd",new Date(), 169.25, "INR"));
		return stocks;
	}

}
