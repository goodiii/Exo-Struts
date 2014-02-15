package com.stub.client;

import java.util.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;

public class EntreeClient {

    public static void main(String[] args) throws Exception {

        Hashtable<String, String> env = new Hashtable<String, String>();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.cosnaming.CNCtxFactory");
        env.put(Context.PROVIDER_URL, "iiop://localhost:1049");
        Context ctx = new InitialContext(env); // JNDI

        Object objref = (Entree) ctx.lookup("entree");

        Entree c = (Entree) PortableRemoteObject.narrow(objref, Entree.class); // on créé un stub associé à l'objet distante

        System.out.println(c.getEntree());

    }
}
