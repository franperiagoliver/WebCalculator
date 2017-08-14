package com.everis.beca.ws;

import javax.xml.ws.Endpoint;

public class CalculatorServer {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8081/calculadora", new CalculatorImpl());
	}
}
