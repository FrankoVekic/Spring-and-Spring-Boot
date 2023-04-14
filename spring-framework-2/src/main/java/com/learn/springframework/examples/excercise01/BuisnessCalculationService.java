package com.learn.springframework.examples.excercise01;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class BuisnessCalculationService {

	private DataService dataService;

	public BuisnessCalculationService(@Qualifier("MySQLDataServiceQualifier") DataService dataService) {
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}
