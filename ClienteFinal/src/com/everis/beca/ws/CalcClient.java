package com.everis.beca.ws;

public class CalcClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculationResult result = new CalculatorImplService().getCalculatorImpl().add(5, 7);
		System.out.println(result);
	}

}
