package com.empresa.soa;

public class TimeServerProxy implements com.empresa.soa.TimeServer {
  private String _endpoint = null;
  private com.empresa.soa.TimeServer timeServer = null;
  
  public TimeServerProxy() {
    _initTimeServerProxy();
  }
  
  public TimeServerProxy(String endpoint) {
    _endpoint = endpoint;
    _initTimeServerProxy();
  }
  
  private void _initTimeServerProxy() {
    try {
      timeServer = (new com.empresa.soa.TimeServerImplServiceLocator()).getTimeServerImplPort();
      if (timeServer != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)timeServer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)timeServer)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (timeServer != null)
      ((javax.xml.rpc.Stub)timeServer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.empresa.soa.TimeServer getTimeServer() {
    if (timeServer == null)
      _initTimeServerProxy();
    return timeServer;
  }
  
  public java.lang.String getTimeServiceAsString() throws java.rmi.RemoteException{
    if (timeServer == null)
      _initTimeServerProxy();
    return timeServer.getTimeServiceAsString();
  }
  
  public long getTimeServiceAsLong() throws java.rmi.RemoteException{
    if (timeServer == null)
      _initTimeServerProxy();
    return timeServer.getTimeServiceAsLong();
  }
  
  
}