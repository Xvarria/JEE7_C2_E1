package com.empresa.soa;

import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) {
		TimeServerProxy timeServiceProxy = new TimeServerProxy();
		try {
			System.out.println(timeServiceProxy.getTimeServiceAsString());
			System.out.println(timeServiceProxy.getTimeServiceAsLong());
		} catch (RemoteException e) {
			System.err.println("Error al invocar WS: " + e.getMessage());
		}
	}
}
