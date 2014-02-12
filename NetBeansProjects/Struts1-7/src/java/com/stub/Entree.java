package com.stub;

import java.rmi.*;

/**
 *
 * @author user
 */
public interface Entree extends Remote {

    /**
     * @return 
     * @throws java.rmi.RemoteException
     */
    public String getEntree() throws RemoteException;
    // TODO code application logic here
}
