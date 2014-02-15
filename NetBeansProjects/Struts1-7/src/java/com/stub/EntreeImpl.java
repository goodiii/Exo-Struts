package com.stub;

import java.rmi.RemoteException;
import javax.rmi.PortableRemoteObject;

public class EntreeImpl extends PortableRemoteObject implements Entree {

	// Implementations must have an explicit constructor 
    // in order to declare the RemoteException exception 
    public EntreeImpl() throws RemoteException {
        super();
    }

    @Override
    public String getEntree() throws RemoteException {
        return "salade";
    }

}
