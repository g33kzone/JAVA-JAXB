package com.g33kzone;

public class JAXBApp {

	public static void main(String[] args) {

		System.out.println("\n Example for Marshalling :: Object --> XML \n");
		
		// Conversion of Student object to XML
		JAXBMarshal xmlMarshal = new JAXBMarshal();
		xmlMarshal.marhsal();

		System.out.println("\n Example for Unmarshalling :: XML --> Object \n");
		
		// Conversion of XML to Student object
		JAXBUnMarshal xmlUnMarshal = new JAXBUnMarshal();
		xmlUnMarshal.unmarhsal();
	}

}
