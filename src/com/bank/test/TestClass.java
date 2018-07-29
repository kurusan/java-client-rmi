package com.bank.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.bank.client.Client;
import com.bank.logic.Agency;

public class TestClass {

	public static void main(String[] args) {
		
		Client client = new Client();
		
		// Agency ag = new Agency("RMI","RMI");
		// client.invoke().createAgency(ag);
		
		ArrayList<Agency> list = client.invoke().getAgencies();
		if(list == null) System.out.println("Empty list");
		else {
			Iterator<Agency> it = list.iterator();
			while(it.hasNext()){
				System.out.println(it.next().getAgName());
			}
		}
		
	}
}
