package com.bank.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.bank.interfaces.DataInterface;

public class Client {
	
	private Invoke invoke;
	public DataInterface dataInterface;

	public Client() {
		try {
			dataInterface = (DataInterface) Naming.lookup("rmi://localhost:1099/BK");
			this.invoke = new Invoke(dataInterface);
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Give the invoke helper which we'll use to invoke remote methods.
	 * @return Invoke - instantiated invoke object
	 */
	public Invoke invoke() {
		return this.invoke;
	}
}
