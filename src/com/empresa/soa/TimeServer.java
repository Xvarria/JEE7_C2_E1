/**
 * TimeServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.empresa.soa;

public interface TimeServer extends java.rmi.Remote {
    public java.lang.String getTimeServiceAsString() throws java.rmi.RemoteException;
    public long getTimeServiceAsLong() throws java.rmi.RemoteException;
}
