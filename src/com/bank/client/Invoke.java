package com.bank.client;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import com.bank.interfaces.DataInterface;
import com.bank.logic.Account;
import com.bank.logic.Agency;
import com.bank.logic.Customer;
import com.bank.logic.Operation;

public class Invoke {
	
	private DataInterface remoteObject;
	
	public Invoke(DataInterface remote) {
		this.remoteObject = remote;
	}
	
	public void createAgency(Agency agency) {
		try {
			this.remoteObject.createAgency(agency);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createCustomer(Customer customer){
		try {
			this.remoteObject.createCustomer(customer);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createOperation(Operation operation){
		try {
			this.remoteObject.createOperation(operation);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createAccount(Account account){
		try {
			this.remoteObject.createAccount(account);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList <Agency> getAgencies(){
		try {
			return (ArrayList<Agency>) this.remoteObject.getAgencies();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList <Customer> getCustomers(){
		try {
			return (ArrayList<Customer>) this.remoteObject.getCustomers();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList <Account> getAccounts(){
		try {
			return (ArrayList<Account>) this.remoteObject.getAccounts();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList <Operation> getOperations(){
		try {
			return (ArrayList<Operation>) this.remoteObject.getOperations();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList <Customer> getCustomersByAgency(String agencyName){
		try {
			return (ArrayList<Customer>) this.remoteObject.getCustomersByAgency(agencyName);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList <Account> getAccountsByCustomer(String customerID){
		try {
			return (ArrayList<Account>) this.remoteObject.getAccountsByCustomer(customerID);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int deleteAccount(Account account, String clause) {
		try {
			return this.remoteObject.deleteAccount(account, clause);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteOperation(Operation operation, String clause) {
		try {
			return this.remoteObject.deleteOperation(operation, clause);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteAgency(Agency agency, String clause) {
		try {
			return this.remoteObject.deleteAgency(agency, clause);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteCustomer(Customer customer, String clause) {
		try {
			return this.remoteObject.deleteCustomer(customer, clause);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateAccount(Account account, String clause) {
		try {
			return this.remoteObject.updateAccount(account, clause);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateOperation(Operation operation, String clause) {
		try {
			return this.remoteObject.updateOperation(operation, clause);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateAgency(Agency agency, String clause) {
		try {
			return this.remoteObject.updateAgency(agency, clause);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateCustomer(Customer customer, String clause) {
		try {
			return this.remoteObject.updateCustomer(customer, clause);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public List<Operation> getOperationsByAccount(String accountID) {
		try {
			return this.remoteObject.getOperationsByAccount(accountID);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String getAccountStat(String temp) {
		try {
			return this.remoteObject.getAccountStat(temp);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	
	public List<Agency> getAgencyByName(String agencyName) {
		try {
			return this.remoteObject.getAgencyByName(agencyName);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Agency> getAgencyByID(String agencyID) {
		try {
			return this.remoteObject.getAgencyByID(agencyID);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
