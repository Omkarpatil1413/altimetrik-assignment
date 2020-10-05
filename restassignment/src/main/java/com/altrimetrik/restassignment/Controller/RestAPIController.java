package com.altrimetrik.restassignment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altrimetrik.restassignment.Service.StockService;
import com.altrimetrik.restassignment.pojo.Stock;

@RestController
public class RestAPIController {
	
	@Autowired
	StockService stockService;
	
	
	@GetMapping("/stocks")
	public ResponseEntity<?> stocks(){
		List<Stock> stocks =stockService.getStocks();
		if(stocks.size()<=10)
		    return new ResponseEntity<>(stocks, HttpStatus.OK);
		else
		    return new ResponseEntity<>("Stock List Limit Exceeds", HttpStatus.INSUFFICIENT_STORAGE);
		
	}

}
