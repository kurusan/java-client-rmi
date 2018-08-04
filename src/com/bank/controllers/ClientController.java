package com.bank.controllers;

import com.bank.client.Client;

public class ClientController {
	
	private static Client client = null;
	
	public static Client getClient() {
		if(client == null) {
			return client = new Client();
		}
		else return client;
	}
}
